package Designpatterns.abstarctFactory.components.Button;

public class AndroidButton implements Button{
    @Override
    public void changeSize() {
        System.out.println("changing Android size");
    }
}
