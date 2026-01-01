package com.encapsulationandpolymorphism.vehiclerentalsystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalApp {

    public static void main(String[] args) {

        List<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("MH12AB1234", 2000, "CAR123"));
        vehicles.add(new Bike("MH14XY5678", 500, "BIKE456"));
        vehicles.add(new Truck("MH20TR9999", 4000, "TRUCK789"));

        int rentalDays = 3;

        for (Vehicle vehicle : vehicles) {

            vehicle.displayVehicleDetails();

            double rent = vehicle.calculateRentalCost(rentalDays);
            System.out.println("Rental Cost (" + rentalDays + " days): " + rent);

            if (vehicle instanceof Insurable) {
                Insurable insurable = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurable.calculateInsurance());
                insurable.getInsuranceDetails();
            }

            System.out.println("-------------------------------");
        }
    }
}
