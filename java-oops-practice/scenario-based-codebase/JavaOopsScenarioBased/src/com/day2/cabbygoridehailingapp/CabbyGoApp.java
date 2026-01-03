package com.day2.cabbygoridehailingapp;

public class CabbyGoApp {

    public static void main(String[] args) {

        Vehicle vehicle = new SUV("MH12AB1234");
        Driver driver = new Driver("Rahul", "DL12345", 4.8);

        IRideService ride = new RideService(vehicle, driver);
        ride.bookRide(12);   // distance in km
        ride.endRide();
    }
}
