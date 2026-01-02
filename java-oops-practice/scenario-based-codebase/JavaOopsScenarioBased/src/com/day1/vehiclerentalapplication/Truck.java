package com.day1.vehiclerentalapplication;

public class Truck extends Vehicle implements Rentable {

    private double loadCharge = 1000;

    public Truck(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + loadCharge;
    }
}
