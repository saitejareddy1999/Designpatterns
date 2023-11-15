package TTTCode.Models;

import TTTCode.Exception.GameInvalidationException;
import TTTCode.Strategies.WinningStrategies.PlayerWinningStrategy;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private List<Player> players;
    private Board board;
    private List<Move> moves;
    private Player Winner;
    private GameState gameState;//TO GET WHAT IS THE final STATUS
    // PLAYING
    private int NextMovePlayerIdx;//WHICH PLAYER HAS THE TURN
    private List<PlayerWinningStrategy> playerWinningStrategy;
    public static class Builder{
        private int dimension;
        private List<Player> players;
        private List<PlayerWinningStrategy> playerWinningStrategy;


        public Builder setDimension(int dimension) {
            this.dimension = dimension;
            return this;
        }

        public Builder setPlayers(List<Player> players) {
            this.players = players;
            return this;
        }

        public Builder setPlayerWinningStrategy(List<PlayerWinningStrategy> playerWinningStrategy) {
            this.playerWinningStrategy = playerWinningStrategy;
            return this;
        }
        public boolean Validate(){
            int bot = 0;
            for(Player player: players ){//only 1 bot is allowed per game
                if(player.getPlayerType().equals(PlayerType.BOT)){
                    bot++;
                }
                if(bot > 1) {
                    return false;
                }
            }
            if(dimension < 3){
                return false;
            }
            if(players.size() != dimension - 1){
                return false;
            }
            return true;
        }
        public Game builder() throws Exception {
            if (!Validate()){
                throw new GameInvalidationException("there are invalid bot " +
                        "players has given");//if we write this in separate
                // while debugging class we are not able to search it is a good
                // practise to ffwrite
            }
            return new Game(dimension,players,playerWinningStrategy);
        }


    }
    private Game(int dimension,List<Player> players,
                 List<PlayerWinningStrategy> playerWinningStrategy){
        this.board = new Board(dimension);
        this.gameState = GameState.IN_PROGRESS;
        this.NextMovePlayerIdx = 0;
        this.players = players;
        this.playerWinningStrategy = playerWinningStrategy;
        this.moves = new ArrayList<>();//DYNAMIC CREATION
    }

//    public Game(Builder builder) {
//        this.players = builder.getPlayers();
//        this.playerWinningStrategy = builder.getPlayerWinningStrategy();
//
//    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public List<Move> getMoves() {
        return moves;
    }

    public void setMoves(List<Move> moves) {
        this.moves = moves;
    }

    public Player getWinner() {
        return Winner;
    }

    public void setWinner(Player winner) {
        Winner = winner;
    }

    public GameState getGameState() {
        return gameState;
    }

    public void setGameState(GameState gameState) {
        this.gameState = gameState;
    }

    public int getNextMovePlayerIdx() {
        return NextMovePlayerIdx;
    }

    public void setNextMovePlayerIdx(int nextMovePlayerIdx) {
        NextMovePlayerIdx = nextMovePlayerIdx;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public static Builder getBuilder(){
        return new Builder();
    }
    public void printBoard(){
        board.displayBoard();
    }
    public void undo(){}
    //1)to make a move not filling a state means x or o
    //2)before playing a move we should validate the move to validate the
    // move player is not responsible, game class has the responsibilities to
    // move
    private boolean isValidMove(Move move){
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
//        return row < board.getSize() && row >= 0 && col < getBoard().getSize() && col >= 0
//                && board.getBoard().get(row).get(col).getCellstate().equals(CellState.EMPTY);
        return row < board.getSize() && row >= 0 && col < board.getSize() && col >= 0
                && board.getBoard().get(row).get(col).getCellstate().equals(CellState.EMPTY);
//        if(row >= board.getSize() || row < 0 || col >= board.getSize() || col < 0
//                || !board.getBoard().get(row).get(col).getCellstate().equals(CellState.EMPTY)){
//            return false;
//        }
//        return true;
    }
    private boolean ischeckWinner(Board board,Move move){
        for(PlayerWinningStrategy playerWinningStrategy : playerWinningStrategy){
            if(playerWinningStrategy.whoIsWinner(board,move)){
                return true;
            }
        }
        return false;

    }
    public void makeMove(Board board){

        Player currentPlayer = players.get(NextMovePlayerIdx);//the current player is making a move
        System.out.println("it is " + currentPlayer.getName() + "'s move" );
        Move move = currentPlayer.makeMove(board);//ask the player to make move 1 step
        System.out.println(currentPlayer.getName()+ " has made a move at row "+ move.getCell().getRow()+
                ", col " + move.getCell().getCol());
        //-------------------
        //validate before the move
        if(!isValidMove(move)){
            System.out.println("Invalid move " + currentPlayer.getName());
            return;
        }//1)after getting row and col, we have to make a move to cell
        //2)have to make a new cell into move filled
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Cell finalCellToMakeMove = board.getBoard().get(row).get(col);//get
        // row and col to fill cell
        finalCellToMakeMove.setCellstate(CellState.FILLED);
        finalCellToMakeMove.setPlayer(currentPlayer);

        Move finalmove = new Move(finalCellToMakeMove,currentPlayer);
        moves.add(finalmove);
        NextMovePlayerIdx += 1;
        NextMovePlayerIdx %= players.size();
        //once a player has made a move have to check a winner
        if(ischeckWinner(board,finalmove)){
            gameState = GameState.ENDED;
            Winner = currentPlayer;
        }else if(moves.size() == board.getSize() * board.getSize()){
            gameState = GameState.DRAW;
        }
    }


}
