package entity;

public class CabDriverEntity {
    int locationId;
    int vehicleNo;
    String vehicleCategory;
    String vehicleStatus;
    long driverContactNumber;

    public CabDriverEntity(int locationId, int vehicleNo, String vehicleCategory, String vehicleStatus, long driverContactNumber) {
        this.locationId = locationId;
        this.vehicleNo = vehicleNo;
        this.vehicleCategory = vehicleCategory;
        this.vehicleStatus = vehicleStatus;
        this.driverContactNumber = driverContactNumber;
    }

    public int getLocationId() {
        return locationId;
    }

    public void setLocationId(int locationId) {
        this.locationId = locationId;
    }

    public int getVehicleNo() {
        return vehicleNo;
    }

    public void setVehicleNo(int vehicleNo) {
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
}
