package com.encapsulationandpolymorphism.ridehailingapplication;

import java.util.ArrayList;
import java.util.List;

public class RideHailingApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car(1, "Amit", 15));
        vehicles.add(new Bike(2, "Rohit", 10));
        vehicles.add(new Auto(3, "Suresh", 12));

        calculateFareForRide(vehicles, 10); // 10 km ride
    }

    // Polymorphic method
    public static void calculateFareForRide(List<Vehicle> vehicles, double distance) {

        for (Vehicle vehicle : vehicles) {

            vehicle.getVehicleDetails();

            if (vehicle instanceof GPS) {
                GPS gps = (GPS) vehicle;
                gps.updateLocation("City Center");
                System.out.println("Current Location: " + gps.getCurrentLocation());
            }

            System.out.println("Fare for " + distance + " km: "
                    + vehicle.calculateFare(distance));
            System.out.println("-------------------------------");
        }
    }
}
