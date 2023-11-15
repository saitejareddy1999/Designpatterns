package Threading.AdderSubtractorMutex;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Main {
    public static void main(String[] args) throws  InterruptedException, ExecutionException {
        Value v = new Value();
        Lock l = new ReentrantLock();// this will create mutex but there is
        // one step to call this lock actually we have to call object
        //ReentrantLock:id=f some thread is locking and unlocking ,u are allowed
        // to lock again, same thread can lock are allowed to lock and unlock
        Adder adder = new Adder(v,l);
        Subtractor subtractor = new Subtractor(v,l);

        ExecutorService es = Executors.newCachedThreadPool();

        Future<Void> adderFuture = es.submit(adder);
        Future<Void> subtractorFuture = es.submit(subtractor);
        adderFuture.get();
        subtractorFuture.get();

        System.out.println(v.value);
    }
}
