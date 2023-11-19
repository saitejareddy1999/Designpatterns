package Designpatterns.Observer;

import java.util.ArrayList;
import java.util.List;

public class Flipkart {
    private static Flipkart instance = null;
    List<onOrderPlacedSubscriber> onOrderPlacedSubscribers = new ArrayList<>();
//    private Flipkart(){}
    public static Flipkart getInstance(){
        if (instance == null){
            instance = new Flipkart();
        }
        return instance;
    }
    void registerSubscribers(onOrderPlacedSubscriber onorderPlacedSubscriber){
        onOrderPlacedSubscribers.add(onorderPlacedSubscriber);
    }
    void unregisterSubscriber(onOrderPlacedSubscriber onorderPlacedSubscriber){
        onOrderPlacedSubscribers.remove(onorderPlacedSubscriber);
    }
    public void onOrderPlaced(){
        for(onOrderPlacedSubscriber onorderPlacedSubscriber : onOrderPlacedSubscribers){
            onorderPlacedSubscriber.announceUser();
        }
    }
}
