package TTTCode.Models;

import TTTCode.Strategies.PlayerStrategies.BotPlayingStrategy;

public class Bot extends Player {
    private BotDifficultyLevel botDifficultyLevel;
    private BotPlayingStrategy botPlayingStrategy;

    public Bot(String Name, Symbol symbol, PlayerType playerType,
               BotDifficultyLevel botDifficultyLevel,
               BotPlayingStrategy botPlayingStrategy) {
        super(Name, symbol, playerType);
        this.botDifficultyLevel = botDifficultyLevel;
        this.botPlayingStrategy = botPlayingStrategy;

    }

    public BotDifficultyLevel getBotDifficultyLevel() {
        return botDifficultyLevel;
    }

    public void setBotDifficultyLevel(BotDifficultyLevel botDifficultyLevel) {
        this.botDifficultyLevel = botDifficultyLevel;
    }

    public BotPlayingStrategy getBotPlayingStrategy() {
        return botPlayingStrategy;
    }

    public void setBotPlayingStrategy(BotPlayingStrategy botPlayingStrategy) {
        this.botPlayingStrategy = botPlayingStrategy;
    }

    @Override
    public Move makeMove(Board board) {
        //how bot will make a move
        //bot will be moved based on its difficulty level
        Move move = botPlayingStrategy.makeMove(board);
        move.setPlayer(this);
        return move;
    }
}

//        try {
//            // Your code that calls makeMove
//            if(move != null) {
//                move.setPlayer(this);
//            }
//        } catch (NullMoveException e) {
//            // Handle the exception, log it, or take appropriate action
//            System.err.println("Error: " + e.getMessage());
//        }

//        if(move != null) {
//            move.setPlayer(this);
//
//        }
////        else{
////            throw new NullMoveException("The makeMove method returned a null move.");
////        }
//        return move;
//    }

