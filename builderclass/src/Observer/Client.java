package Observer;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = Flipkart.getInstance();
        emailService emailService = new emailService();
        inventoryService inventoryService = new inventoryService();
        invoiceGenerator invoiceGenerator = new invoiceGenerator();
        flipkart.onOrderPlaced();
    }
}
