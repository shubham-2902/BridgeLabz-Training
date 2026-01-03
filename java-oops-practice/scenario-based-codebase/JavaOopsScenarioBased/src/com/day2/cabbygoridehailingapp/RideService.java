package com.day2.cabbygoridehailingapp;

public class RideService implements IRideService {

    private Vehicle vehicle;
    private Driver driver;
    private final double baseFare = 50;

    public RideService(Vehicle vehicle, Driver driver) {
        this.vehicle = vehicle;
        this.driver = driver;
    }

    @Override
    public void bookRide(double distance) {
        double fare = baseFare + (distance * vehicle.getRatePerKm());
        vehicle.setFare(fare);
        System.out.println("Ride booked with " + driver.getName());
        System.out.println("Vehicle Type: " + vehicle.type);
        System.out.println("Fare: ₹" + vehicle.getFare());
    }

    @Override
    public void endRide() {
        System.out.println("Ride ended. Total Fare: ₹" + vehicle.getFare());
    }
}
