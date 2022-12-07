package src.entity;

public class CabDriverEntity {
    private int locationId;
    private String vehicleNo;
    private String vehicleCategory;
    private String vehicleStatus;
    private long driverContactNumber;

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public String getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(String vehicleNo) {
        this.vehicleNo = vehicleNo;
    }

    public String getVehicleCategory() {
        return vehicleCategory;
    }

    public void setVehicleCategory(String vehicleCategory) {
        this.vehicleCategory = vehicleCategory;
    }

    public String getVehicleStatus() {
        return vehicleStatus;
    }

    public void setVehicleStatus(String vehicleStatus) {
        this.vehicleStatus = vehicleStatus;
    }

    public long getDriverContactNumber() {
        return driverContactNumber;
    }

    public void setDriverContactNumber(long driverContactNumber) {
        this.driverContactNumber = driverContactNumber;
    }

    @Override
    public String toString() {
        return locationId +
                ", '" + vehicleNo + '\'' +
                ", '" + vehicleCategory + '\'' +
                ", " + vehicleStatus + '\'' +
                ", " + driverContactNumber;
    }
}