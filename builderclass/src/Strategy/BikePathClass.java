package Strategy;

public class BikePathClass implements PathCalculatorStrategy{
    @Override
    public void pathCalculator(String fromLocation, String toLocation) {
        System.out.println("Bike path");
    }
}
