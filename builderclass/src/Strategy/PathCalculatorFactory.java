package Strategy;

public class PathCalculatorFactory {
    public static PathCalculatorStrategy getPathCalculatorMode(String mode){
        if(mode.equals("car")){
            return new CarPathClass();
        } else if (mode.equals("bike")) {
            return new BikePathClass();
        }else {
            return new WalkablePathClass();
        }
    }
}
