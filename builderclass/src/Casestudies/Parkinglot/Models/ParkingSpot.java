package Casestudies.Parkinglot.Models;

public class ParkingSpot extends BaseModel{
    private int parkingSpotNumber;
    private ParkingSpotStatus parkingSpotStatus;

    public int getParkingSpotNumber() {
        return parkingSpotNumber;
    }

    public void setParkingSpotNumber(int parkingSpotNumber) {
        this.parkingSpotNumber = parkingSpotNumber;
    }

    public ParkingSpotStatus getParkingSpotStatus() {
        return parkingSpotStatus;
    }

    public void setParkingSpotStatus(ParkingSpotStatus parkingSpotStatus) {
        this.parkingSpotStatus = parkingSpotStatus;
    }

    public ParkingSpotVehicleType getParkingSpotVehicleType() {
        return parkingSpotVehicleType;
    }

    public void setParkingSpotVehicleType(ParkingSpotVehicleType parkingSpotVehicleType) {
        this.parkingSpotVehicleType = parkingSpotVehicleType;
    }

    private ParkingSpotVehicleType parkingSpotVehicleType;
}
