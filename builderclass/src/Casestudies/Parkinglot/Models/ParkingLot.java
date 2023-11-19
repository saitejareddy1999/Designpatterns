package Casestudies.Parkinglot.Models;

import java.util.List;

public class ParkingLot extends BaseModel {
    private List<ParkingFloors> floors;
    private List<Gate> gate;
    private String address;

    public List<ParkingFloors> getFloors() {
        return floors;
    }

    public void setFloors(List<ParkingFloors> floors) {
        this.floors = floors;
    }

    public List<Gate> getGate() {
        return gate;
    }

    public void setGate(List<Gate> gate) {
        this.gate = gate;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
