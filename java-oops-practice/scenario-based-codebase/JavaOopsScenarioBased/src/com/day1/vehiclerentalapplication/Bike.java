package com.day1.vehiclerentalapplication;

public class Bike extends Vehicle implements Rentable {

    public Bike(int vehicleId, String brand, double baseRate) {
        super(vehicleId, brand, baseRate);
    }

    @Override
    public double calculateRent(int days) {
        return baseRate * days; // simple rent
    }
}
