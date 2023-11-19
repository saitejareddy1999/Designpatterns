package Casestudies.Parkinglot.Models;

import java.util.List;

public class Payments extends BaseModel{
    private int amount;
    private int transId;
    private List<PaymentModeStatus> modeOfPayments;
    private PaymentStatus PaymentStatus;

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTransId() {
        return transId;
    }

    public void setTransId(int transId) {
        this.transId = transId;
    }

    public List<PaymentModeStatus> getModeOfPayments() {
        return modeOfPayments;
    }

    public void setModeOfPayments(List<PaymentModeStatus> modeOfPayments) {
        this.modeOfPayments = modeOfPayments;
    }

    public Casestudies.Parkinglot.Models.PaymentStatus getPaymentStatus() {
        return PaymentStatus;
    }

    public void setPaymentStatus(Casestudies.Parkinglot.Models.PaymentStatus paymentStatus) {
        PaymentStatus = paymentStatus;
    }
}
