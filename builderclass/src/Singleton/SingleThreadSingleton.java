package Singleton;

public class SingleThreadSingleton {
    private static  SingleThreadSingleton singleThreadSingleton = null;
    private SingleThreadSingleton(){}
    public static SingleThreadSingleton getInstance(){
    if (singleThreadSingleton == null){
        singleThreadSingleton  = new SingleThreadSingleton();
    }
    return singleThreadSingleton;
    }
}
