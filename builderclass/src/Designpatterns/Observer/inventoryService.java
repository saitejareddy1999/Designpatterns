package Designpatterns.Observer;

public class inventoryService implements onOrderPlacedSubscriber{
    public inventoryService(){
        Flipkart flipkart = Flipkart.getInstance();

        flipkart.registerSubscribers(this);
    }
    @Override
    public void announceUser() {
        System.out.println("this is inventory service");
    }
//    public void deRegister(){
//        flipkart.unregisterSubscriber(this);
//    }
}
