package TTTCode.Controllers;

import TTTCode.Models.Game;
import TTTCode.Models.GameState;
import TTTCode.Models.Player;
import TTTCode.Strategies.WinningStrategies.PlayerWinningStrategy;

import java.util.List;

public class GameController {
    public Game startGame(int boardDimension, List<Player> players,
                          List<PlayerWinningStrategy> winningStrategies) throws Exception {
        return Game.getBuilder().
                setDimension(boardDimension)
                .setPlayers(players)
                .setPlayerWinningStrategy(winningStrategies).builder();
    }//used to start a game with required parameters

    public void makeMove(Game game) {
        game.makeMove(game.getBoard());
    }

    public void displayBoard(Game game) {
        game.printBoard();
    }

    public Player getWinner(Game game) {
        return game.getWinner();
    }

    public void undo(Game game) {
        game.undo();
    }
    public GameState getGameState(Game game){
        return game.getGameState();
    }
}
