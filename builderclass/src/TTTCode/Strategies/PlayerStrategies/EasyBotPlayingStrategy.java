package TTTCode.Strategies.PlayerStrategies;

import TTTCode.Models.*;

import java.util.List;

public class EasyBotPlayingStrategy implements BotPlayingStrategy{
    @Override
    public Move makeMove(Board board) {
        //bot will make a move the first available cell is there
        for(List<Cell> row: board.getBoard()){
            for(Cell cell:row){
                if(cell.getCellstate().equals(CellState.EMPTY)){
                    //make a move
                    return new Move(cell,null);
                }

            }
        }
        //        for (int i = 0; i < board.getDimension(); i++) {
//            for (int j = 0; j < board.getDimension(); j++) {
//                Cell cell = board.getBoard().get(i).get(j);
//                if (cell.getCellState().equals(CellState.EMPTY)) {
//                    //make a move.
//                }
//            }
//        }
        return null;
        }
    }
