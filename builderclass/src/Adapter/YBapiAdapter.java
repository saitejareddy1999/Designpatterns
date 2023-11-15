package Adapter;

public class YBapiAdapter implements BankApi{
//    YBapiAdapter Yb = new YBapiAdapter();
    @Override
    public double getBalance(String accoutNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String from, String to, double amount) {
        System.out.println("sending from YB +"+ amount +  " rs from "+ from +"to " +to);
        return false;
    }
}
