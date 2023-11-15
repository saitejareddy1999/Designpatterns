package TTTCode.Strategies.WinningStrategies;

import TTTCode.Models.Board;
import TTTCode.Models.Move;
import TTTCode.Models.Symbol;

import java.util.HashMap;
import java.util.Map;

public class colWinningStrategy implements PlayerWinningStrategy{
    private Map<Integer, Map<Symbol,Integer>> colMap = new HashMap<>();
    @Override
    public boolean whoIsWinner(Board board, Move move) {
        int col = move.getCell().getCol();
        Symbol symbol = move.getPlayer().getSymbol();
        if (!colMap.containsKey(col)) {
            colMap.put(col,new HashMap<>());
        }
        Map<Symbol,Integer> colMapDict = colMap.get(col);
        if(colMapDict.containsKey(symbol)){
            colMapDict.put(symbol,colMapDict.get(symbol) + 1);
        }else{
            colMapDict.put(symbol,1);
        }
        return colMapDict.get(symbol) == board.getSize();
    }
}
