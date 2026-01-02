package com.day1.vehiclerentalapplication;

public class Vehicle {

    protected int vehicleId;
    protected String brand;
    protected double baseRate; // per day rate

    public Vehicle(int vehicleId, String brand, double baseRate) {
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.baseRate = baseRate;
    }

    // Encapsulation
    public int getVehicleId() {
        return vehicleId;
    }

    public String getBrand() {
        return brand;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void displayInfo() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Brand: " + brand);
        System.out.println("Base Rate per Day: ₹" + baseRate);
    }
}
