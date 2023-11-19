package Designpatterns.Adapter;

public class IciciapiAdapter implements BankApi{
//    IciciapiAdapter Icici = new IciciapiAdapter();
    @Override
    public double getBalance(String accoutNumber) {
        return 0;
    }

    @Override
    public boolean sendMoney(String from, String to, double amount) {
        System.out.println("sending from ICICIB +"+ amount +  " rs from "+ from +"to " +to);
        return false;
    }
}
