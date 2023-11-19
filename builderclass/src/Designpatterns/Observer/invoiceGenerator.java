package Designpatterns.Observer;

public class invoiceGenerator implements onOrderPlacedSubscriber{
    public invoiceGenerator(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscribers(this);
    }
    @Override
    public void announceUser() {
        System.out.println("invoice generator");
    }
}
