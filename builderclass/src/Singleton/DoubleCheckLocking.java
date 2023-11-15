package Singleton;

public class DoubleCheckLocking {
    private static DoubleCheckLocking instance = null;
    private DoubleCheckLocking(){}

    public static DoubleCheckLocking getInstance() {
        if(instance ==null){
            synchronized(DoubleCheckLocking.class) {
                if (instance == null) {
                    instance = new DoubleCheckLocking();
                }
            }
        }
        return instance;
    }
}
