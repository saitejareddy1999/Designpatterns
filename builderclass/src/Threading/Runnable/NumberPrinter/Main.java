package Threading.Runnable.NumberPrinter;

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 500; ++i) {
            if (i == 80) {
                System.out.println("STOP");
            }
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread t = new Thread(numberPrinter);
            t.start();
        }
    }
}
