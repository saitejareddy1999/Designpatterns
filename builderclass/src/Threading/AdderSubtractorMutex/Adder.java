package Threading.AdderSubtractorMutex;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Adder implements Callable<Void> {
    private Value v;
    private Lock lock;

    public Adder(Value v,Lock lock) {
        this.lock = lock;
        this.v = v;
    }

    @Override
    public Void call() throws Exception {//it indicates that the call() method doesn't return any meaningful value.
//        lock.lock();
        for (int i = 1; i <= 50; ++i) {
            lock.lock();
            this.v.value += i;//this is the critical section
            // occurs so we need to enter only one thread before go inside cs
            //have to take a lock
            System.out.println("adding" +i);
            lock.unlock(); //u are never releasing  to get new thread should
//            run
        }
//        lock.unlock();
        return null;
    }//if we do the lock and unlock inside cs,the threads will work
    // parallel else if we keep outside the cs(for loop) it will run
    // simultaneously
    //1)lock.lock(),lock.unlock() in cs for loop(parallel threads)
    //2)lock.lock(),lock.unlock() outside the loop(simultaneous threads)
    //3)if u just lock.lock() in adder class u are never releasing to get new thread
}
