package Strategy;

public class CarPathClass implements PathCalculatorStrategy{
    @Override
    public void pathCalculator(String fromLocation, String toLocation) {
        System.out.println("car path");
    }
}
