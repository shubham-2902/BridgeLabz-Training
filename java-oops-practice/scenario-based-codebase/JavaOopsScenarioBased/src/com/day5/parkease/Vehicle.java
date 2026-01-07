package com.day5.parkease;
public abstract class Vehicle implements IPayable {

    protected String vehicleNumber;
    protected String vehicleType;
    protected double baseRate; // per hour

    public Vehicle(String vehicleNumber, String vehicleType, double baseRate) {
        this.vehicleNumber = vehicleNumber;
        this.vehicleType = vehicleType;
        this.baseRate = baseRate;
    }

    public String getVehicleType() {
        return vehicleType;
    }
}
