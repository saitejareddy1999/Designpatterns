package TTTCode.Strategies.WinningStrategies;

import TTTCode.Models.Board;
import TTTCode.Models.Move;

public interface PlayerWinningStrategy {
    boolean whoIsWinner(Board board, Move move);
}
