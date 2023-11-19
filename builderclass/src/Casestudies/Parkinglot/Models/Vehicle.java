package Casestudies.Parkinglot.Models;

public class Vehicle extends BaseModel{
    private int VehicleNumber;
    private String Name;
    private VehicleType vehicleType;

    public int getVehicleNumber() {
        return VehicleNumber;
    }

    public void setVehicleNumber(int vehicleNumber) {
        VehicleNumber = vehicleNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }


}
