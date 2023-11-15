package TTTCode;

import TTTCode.Controllers.GameController;
import TTTCode.Models.*;
import TTTCode.Strategies.PlayerStrategies.EasyBotPlayingStrategy;
import TTTCode.Strategies.WinningStrategies.PlayerWinningStrategy;
import TTTCode.Strategies.WinningStrategies.colWinningStrategy;
import TTTCode.Strategies.WinningStrategies.diagonalWinningStrategy;
import TTTCode.Strategies.WinningStrategies.rowWinningStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TicTacToeMain {
    public static void main(String[] args) throws Exception {
// 1
// System.out.println("Hello world!");
        Scanner scanner = new Scanner(System.in);
//        int dimension =
        System.out.println("what is the dimension of the game?");
        int dimension = scanner.nextInt();
        System.out.println("Do u want have bot in a game y/n");
        String isBot = scanner.next();
        List<Player> players = new ArrayList<>();
        int numberOfPlayers = dimension - 1;
        if(isBot.equals("y") ){
            numberOfPlayers = dimension - 2;
        }
        for(int i = 0;i < numberOfPlayers; i++){
            System.out.println("what is the name of the player:");
            String name = scanner.next();
            System.out.println("what is the symbol of the player:");
            String symbol = scanner.next();
            players.add(new Player(name,new Symbol(symbol.charAt(0)),
                    PlayerType.HUMAN));
        }
        if(isBot.charAt(0) == 'y'){
            players.add(new Bot("BOT",new Symbol('O'),
                    PlayerType.BOT, BotDifficultyLevel.EASY,new EasyBotPlayingStrategy()));
        }
        GameController gameController = new GameController();
//        players.add(new Player("sai",new Symbol('X'), PlayerType.HUMAN,1L));
//        players.add(new Player("teja",new Symbol('X'), PlayerType.HUMAN,2L));
//        players.add(new Bot("BOT",new Symbol('O'), PlayerType.BOT,3L,
//                BotDifficultyLevel.EASY,new EasyBotPlayingStrategy()));
        // each player doesn't know which way they have gone a win the game
        List<PlayerWinningStrategy> winningStrategy = new ArrayList<>();//for
        winningStrategy.add(new rowWinningStrategy());
        winningStrategy.add(new colWinningStrategy());
        winningStrategy.add(new diagonalWinningStrategy());
        //start the game
        Game game = gameController.startGame(dimension,players,winningStrategy);
        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
            //Display the board.
            System.out.println("This is the current state of Board");
            gameController.displayBoard(game);
            //make move
            gameController.makeMove(game);
        }
        if(gameController.getGameState(game).equals(GameState.ENDED)){
            //Somebody has won the game.
            gameController.displayBoard(game);
            System.out.println("winner: " +gameController.getWinner(game).getName());
        }else{
            System.out.println("Game has DRAWN");
        }
    }
}
