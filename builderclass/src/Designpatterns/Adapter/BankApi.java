package Designpatterns.Adapter;

public interface BankApi {
    double getBalance(String accoutNumber);
    boolean sendMoney(String from,
                      String to,
                      double amount);
}
