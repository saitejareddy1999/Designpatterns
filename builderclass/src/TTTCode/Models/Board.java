package TTTCode.Models;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private List<List<Cell>> board;
    public Board(int n){//board prototype
        this.size = n;
         board = new ArrayList<>();//rows
        for(int i = 0 ;i < n;i++){//here it will create a board with nXn matrix
            board.add(new ArrayList<>());//cols
            for(int j = 0; j < n;j++){
                board.get(i).add(new Cell(i,j));
            }
        }
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public List<List<Cell>> getBoard() {
        return board;
    }

    public void setBoard(List<List<Cell>> board) {
        this.board = board;
    }
    public void displayBoard(){
        for(int i = 0;i < size;i++){
            for(int j = 0;j < size;j++){
                Cell cell = board.get(i).get(j);
                if(cell.getCellstate().equals(CellState.EMPTY)){
                    System.out.print("|  |");
                }else{
                    System.out.print("|" +cell.getPlayer().getSymbol().getSymbol()+
                            "|");
                }
            }
            System.out.println();
        }
    }
}
