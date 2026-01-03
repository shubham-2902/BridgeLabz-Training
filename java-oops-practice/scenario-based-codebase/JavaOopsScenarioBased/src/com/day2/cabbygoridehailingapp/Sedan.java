package com.day2.cabbygoridehailingapp;

public class Sedan extends Vehicle {

    public Sedan(String vehicleNumber) {
        super(vehicleNumber, 4, "Sedan");
    }

    @Override
    public double getRatePerKm() {
        return 15;
    }
}
