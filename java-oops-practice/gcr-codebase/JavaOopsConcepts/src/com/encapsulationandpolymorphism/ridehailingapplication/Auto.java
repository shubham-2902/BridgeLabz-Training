package com.encapsulationandpolymorphism.ridehailingapplication;

public class Auto extends Vehicle implements GPS {

    private String currentLocation;

    public Auto(int id, String driver, double rate) {
        super(id, driver, rate);
        this.currentLocation = "Unknown";
    }

    @Override
    public double calculateFare(double distance) {
        return ratePerKm * distance * 1.1; // extra charge
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
