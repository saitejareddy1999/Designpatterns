package TTTCode.Models;

import java.util.List;
import java.util.Scanner;

public class Player {
    private String Name;
    private Symbol symbol;
    private PlayerType playerType;
//    private Long id;



    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Symbol getSymbol() {
        return symbol;
    }

    public void setSymbol(Symbol symbol) {
        this.symbol = symbol;
    }

    public PlayerType getPlayerType() {
        return playerType;
    }

    public void setPlayerType(PlayerType playerType) {
        this.playerType = playerType;
    }

//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }

    public Player(String Name, Symbol symbol, PlayerType playerType){
        this.Name = Name;
        this.symbol = symbol;
        this.playerType = playerType;
//        this.id = id;
    }
    public Move makeMove(Board board){
        Scanner scanner =new Scanner(System.in);
        System.out.println("provide the row index to make a move ");
        int rowNumber = scanner.nextInt();
        System.out.println("provide the col index to make a move ");
        int colNumber = scanner.nextInt();
        return new Move(new Cell(rowNumber,colNumber),this);

    }



}
