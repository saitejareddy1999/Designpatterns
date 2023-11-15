package TTTCode.Strategies.PlayerStrategies;

import TTTCode.Models.Board;
import TTTCode.Models.Move;

public interface BotPlayingStrategy {
    Move makeMove(Board board);
}
