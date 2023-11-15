package Adapter;

public class Phonepay {
    public static void main(String[] args) {
        BankApi BA = new YBapiAdapter();
        String saiAccno = "1234";
        String tejaAccno = "4321";
        double amount = 100.0;
        BA.sendMoney(saiAccno,tejaAccno,amount);
      }
}
