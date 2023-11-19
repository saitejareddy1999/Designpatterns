package Casestudies.Parkinglot.Models;

import java.time.ZonedDateTime;
import java.util.List;

public class Ticket extends BaseModel{
    private int ticketNumber;
    private List<ParkingSpot> parkingSpot;
    private ZonedDateTime EntryTime;
    private List<Gate> gate;//from which gate we got an entry
    private List<Operators> operator;
    private List<VehicleType> vehicleType;

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public List<ParkingSpot> getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(List<ParkingSpot> parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public ZonedDateTime getEntryTime() {
        return EntryTime;
    }

    public void setEntryTime(ZonedDateTime entryTime) {
        EntryTime = entryTime;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public List<Operators> getOperator() {
        return operator;
    }

    public void setOperator(List<Operators> operator) {
        this.operator = operator;
    }

    public List<VehicleType> getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(List<VehicleType> vehicleType) {
        this.vehicleType = vehicleType;
    }
}
