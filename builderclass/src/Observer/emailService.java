package Observer;

public class emailService implements onOrderPlacedSubscriber{
    public emailService(){
        Flipkart flipkart = Flipkart.getInstance();
        flipkart.registerSubscribers(this);
    }
    @Override
    public void announceUser() {
        System.out.println("this is an email service");
    }
}
