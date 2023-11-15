package TTTCode.Strategies.WinningStrategies;

import TTTCode.Models.Board;
import TTTCode.Models.Move;
import TTTCode.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class diagonalWinningStrategy implements PlayerWinningStrategy{
    Map<Symbol,Integer> leftDiagonal = new HashMap<>();
    Map<Symbol,Integer> rightDiagonal = new HashMap<>();
    @Override
    public boolean whoIsWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        if(row == col){
            if(leftDiagonal.containsKey(symbol)) {
                leftDiagonal.put(symbol,leftDiagonal.get(symbol) + 1);
            }else{
                leftDiagonal.put(symbol,1);
            }
        }
        if(row + col == board.getSize() - 1){
            if(rightDiagonal.containsKey(symbol)) {
                rightDiagonal.put(symbol,rightDiagonal.get(symbol) + 1);
            }else{
                rightDiagonal.put(symbol,1);
            }
        }
        if(row == col && leftDiagonal.get(symbol) == board.getSize()){
            return true;
        }
        return row + col == board.getSize() - 1 && rightDiagonal.get(symbol) == board.getSize();
    }
}
