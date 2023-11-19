package Designpatterns.Strategy;

public class GoogleMaps {
    public void findPath(String fromLocation,String toLocation,String Mode){
        PathCalculatorStrategy pathCalculatorStrategy = PathCalculatorFactory.getPathCalculatorMode(Mode);
        pathCalculatorStrategy.pathCalculator(fromLocation,toLocation);
    }
}
