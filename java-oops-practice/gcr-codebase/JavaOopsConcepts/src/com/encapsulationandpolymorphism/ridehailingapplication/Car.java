package com.encapsulationandpolymorphism.ridehailingapplication;

public class Car extends Vehicle implements GPS {

    private String currentLocation;

    public Car(int id, String driver, double rate) {
        super(id, driver, rate);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance;
    }

    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
