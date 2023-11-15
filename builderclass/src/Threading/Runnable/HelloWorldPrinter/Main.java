package Threading.Runnable.HelloWorldPrinter;

public class Main {
    public static void main(String[] args) {
        HiiPrinter hi = new HiiPrinter();
        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread t = new Thread(hwp);
        Thread t1 = new Thread(hi);

        t.start();//if we call this thread class firstly it will execute after that main class is
        // executed, if we not call this thread class main will be executed
        t1.start();
        System.out.println("Hello World " + Thread.currentThread().getName());

    }
}
