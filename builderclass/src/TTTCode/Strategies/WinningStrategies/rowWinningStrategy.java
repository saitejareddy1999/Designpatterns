package TTTCode.Strategies.WinningStrategies;

import TTTCode.Models.Board;
import TTTCode.Models.Move;
import TTTCode.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class rowWinningStrategy implements PlayerWinningStrategy{
    private Map<Integer, Map<Symbol,Integer>> rowMap = new HashMap<>();
    @Override
    public boolean whoIsWinner(Board board, Move move) {
        int row = move.getCell().getRow();
        Symbol symbol = move.getPlayer().getSymbol();
        if(!rowMap.containsKey(row)){
            rowMap.put(row,new HashMap<>());
        }
        Map<Symbol,Integer> currentRowMap = rowMap.get(row);
        if(currentRowMap.containsKey(symbol)){
            currentRowMap.put(symbol,currentRowMap.get(symbol) + 1);
        }
        else{
            currentRowMap.put(symbol,1);
        }
        return currentRowMap.get(symbol) == board.getSize();
    }
}