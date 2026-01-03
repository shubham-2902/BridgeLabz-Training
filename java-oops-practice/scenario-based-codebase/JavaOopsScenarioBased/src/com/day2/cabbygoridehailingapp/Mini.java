package com.day2.cabbygoridehailingapp;

public class Mini extends Vehicle {

    public Mini(String vehicleNumber) {
        super(vehicleNumber, 4, "Mini");
    }

    @Override
    public double getRatePerKm() {
        return 10;
    }
}
