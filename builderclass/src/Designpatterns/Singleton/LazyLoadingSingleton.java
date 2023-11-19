package Designpatterns.Singleton;

public class LazyLoadingSingleton {
    private static LazyLoadingSingleton instance = null;

    private LazyLoadingSingleton(){}

    public synchronized static LazyLoadingSingleton getInstance() {
        if(instance ==null){
            instance = new LazyLoadingSingleton();
        }
        return instance;
    }
}
