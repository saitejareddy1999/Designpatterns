package Singleton;

public class EagerLoadingSingleton {
    private static  EagerLoadingSingleton eagerLoadingSingleton = new EagerLoadingSingleton();
    private EagerLoadingSingleton(){}

    public static EagerLoadingSingleton getInstance() {
        return eagerLoadingSingleton;
    }
}
