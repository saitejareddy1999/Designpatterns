//import Casestudies.TTTCode.Controllers.GameController;
//import Casestudies.TTTCode.Models.*;
//import Casestudies.TTTCode.Strategies.PlayerStrategies.EasyBotPlayingStrategy;
//import Casestudies.TTTCode.Strategies.WinningStrategies.PlayerWinningStrategy;
//import Casestudies.TTTCode.Strategies.WinningStrategies.colWinningStrategy;
//import Casestudies.TTTCode.Strategies.WinningStrategies.diagonalWinningStrategy;
//import Casestudies.TTTCode.Strategies.WinningStrategies.rowWinningStrategy;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
//public class TTTMain {
//    public static void main(String[] args) throws Exception {
//// 1
//// System.out.println("Hello world!");
//        Scanner scanner = new Scanner(System.in);
//        GameController gameController = new GameController();
//        int dimension = 3;
////        System.out.println("what is the dimension of the game?");
////        int dimension = scanner.nextInt();
////        System.out.println("Do u want have bot in a game y/n");
////        String isBot = scanner.nextLine();
//        List<Player> players = new ArrayList<>();
//        int numberOfPlayers = dimension - 1;
////        if(isBot.charAt(0) == 'y'){
////            numberOfPlayers = dimension - 2;
////        }
////        for(int i = 0;i < numberOfPlayers; i++){
////            System.out.println("what is the name of the player:");
////            String name = scanner.nextLine();
////            System.out.println("what is the symbol of the player:");
////            String symbol = scanner.nextLine();
////            players.add(new Player(name,new Symbol(symbol.charAt(0))))
////
////        }
//        players.add(new Player("sai",new Symbol('X'), PlayerType.HUMAN,1L));
////        players.add(new Player("teja",new Symbol('X'), PlayerType.HUMAN,2L));
//        players.add(new Bot("BOT",new Symbol('O'), PlayerType.BOT,2L,
//                BotDifficultyLevel.EASY,new EasyBotPlayingStrategy()));
//        List<PlayerWinningStrategy> winningStrategy = new ArrayList<>();
//        winningStrategy.add(new rowWinningStrategy());
//        winningStrategy.add(new colWinningStrategy());
//        winningStrategy.add(new diagonalWinningStrategy());
//        //start the game
//        Game game = gameController.startGame(dimension,players,winningStrategy);
//        while(gameController.getGameState(game).equals(GameState.IN_PROGRESS)){
//            //Display the board.
//            System.out.println("This is the current state of Board");
//            gameController.displayBoard(game);
//            //make move
//            gameController.makeMove(game);
//        }
//        if(gameController.getGameState(game).equals(GameState.ENDED)){
//            //Somebody has won the game.
//            gameController.displayBoard(game);
//            System.out.println("winner: " +gameController.getWinner(game).getName());
//        }else{
//            System.out.println("Game has DRAWN");
//        }
//    }
//}
