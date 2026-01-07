package com.day5.parkease;
public class Car extends Vehicle {

    public Car(String vehicleNumber) {
        super(vehicleNumber, "Car", 50);
    }

    @Override
    public double calculateCharges(int hours) {
        int allowedHours = 5;
        double penalty = (hours > allowedHours) ? (hours - allowedHours) * 20 : 0;
        return (baseRate * hours) + penalty;
    }
}
