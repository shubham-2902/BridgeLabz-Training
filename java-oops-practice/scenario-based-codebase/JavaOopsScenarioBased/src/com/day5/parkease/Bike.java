package com.day5.parkease;
public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, "Bike", 30);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 6;
        double penalty = (hours > allowedHours) ? (hours - allowedHours) * 10 : 0;
        return (baseRate * hours) + penalty;
    }
}
