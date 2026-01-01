package com.encapsulationandpolymorphism.ridehailingapplication;

public abstract class Vehicle {

    private int vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Encapsulation (read-only access)
    public int getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    // Abstract method
    public abstract double calculateFare(double distance);

    // Concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID : " + vehicleId);
        System.out.println("Driver     : " + driverName);
        System.out.println("Rate/Km    : " + ratePerKm);
    }
}
