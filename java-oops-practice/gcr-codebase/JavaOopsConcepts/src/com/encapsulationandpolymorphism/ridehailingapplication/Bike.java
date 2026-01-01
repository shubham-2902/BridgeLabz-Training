package com.encapsulationandpolymorphism.ridehailingapplication;

public class Bike extends Vehicle implements GPS {

    private String currentLocation;

    public Bike(int id, String driver, double rate) {
        super(id, driver, rate);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 0.9; // cheaper
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
