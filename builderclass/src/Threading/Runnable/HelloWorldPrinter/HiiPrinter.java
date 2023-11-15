package Threading.Runnable.HelloWorldPrinter;

public class HiiPrinter implements Runnable {

    @Override
    public void run() {
        System.out.println("Hii from run()" + Thread.currentThread().getName());

    }
}
