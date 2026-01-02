package com.day1.vehiclerentalapplication;

public class VehicleRentalApp {

    public static void main(String[] args) {

        // Customer (hard-coded)
        Customer customer = new Customer(101, "Rahul");

        // Polymorphism
        Rentable bike = new Bike(1, "Hero", 300);
        Rentable car = new Car(2, "Hyundai", 1500);
        Rentable truck = new Truck(3, "Tata", 2500);

        int rentalDays = 3;

        System.out.println("--- Customer Details ---");
        customer.displayCustomer();

        System.out.println("\n--- Bike Rental ---");
        System.out.println("Total Rent: ₹" + bike.calculateRent(rentalDays));

        System.out.println("\n--- Car Rental ---");
        System.out.println("Total Rent: ₹" + car.calculateRent(rentalDays));

        System.out.println("\n--- Truck Rental ---");
        System.out.println("Total Rent: ₹" + truck.calculateRent(rentalDays));
    }
}
