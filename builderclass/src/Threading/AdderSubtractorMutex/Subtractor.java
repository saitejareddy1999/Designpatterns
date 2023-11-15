package Threading.AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtractor implements Callable<Void> {
    private Value v;
    private Lock lock;

    public Subtractor(Value v,Lock lock) {
        this.lock = lock;
        this.v = v;
    }

    @Override
    public Void call() throws Exception {
//        lock.lock();
        for (int i = 1; i <= 50; ++i) {
            lock.lock();
            this.v.value -= i;
            System.out.println("subtracting" +i);
            lock.unlock();
        }
//        lock.unlock();
        return null;
    }
}
