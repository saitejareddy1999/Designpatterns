package Designpatterns.Strategy;

public class WalkablePathClass implements PathCalculatorStrategy{
    @Override
    public void pathCalculator(String fromLocation, String toLocation) {
        System.out.println("Walk path ");
    }
}
