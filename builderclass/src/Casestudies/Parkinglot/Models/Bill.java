package Casestudies.Parkinglot.Models;

import java.time.ZonedDateTime;
import java.util.List;

public class Bill extends BaseModel{
    private Ticket ticket;
    private ZonedDateTime exitTime;
    private int amount;
    private List<Payments> payment;
    private BillStatus billStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ZonedDateTime getExitTime() {
        return exitTime;
    }

    public void setExitTime(ZonedDateTime exitTime) {
        this.exitTime = exitTime;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public List<Payments> getPayment() {
        return payment;
    }

    public void setPayment(List<Payments> payment) {
        this.payment = payment;
    }

    public BillStatus getBillStatus() {
        return billStatus;
    }

    public void setBillStatus(BillStatus billStatus) {
        this.billStatus = billStatus;
    }
}
