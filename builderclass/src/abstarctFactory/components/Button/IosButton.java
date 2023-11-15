package abstarctFactory.components.Button;

public class IosButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("changing Ios size");
    }
}
