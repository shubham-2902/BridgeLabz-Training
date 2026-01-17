package com.day6.fleetmanager;
public class Vehicle {
    private String vehicleId;
    private String model;
    private int mileage;
    private String depotName;

    public Vehicle(String vehicleId, String model, int mileage, String depotName) {
        this.vehicleId = vehicleId;
        this.model = model;
        this.mileage = mileage;
        this.depotName = depotName;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public String getModel() {
        return model;
    }

    public int getMileage() {
        return mileage;
    }

    public String getDepotName() {
        return depotName;
    }

    @Override
    public String toString() {
        return "VehicleID: " + vehicleId +
                ", Model: " + model +
                ", Mileage: " + mileage +
                ", Depot: " + depotName;
    }
}
