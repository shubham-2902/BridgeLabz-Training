package com.encapsulationandpolymorphism.vehiclerentalsystem;

public abstract class Vehicle {

    private String vehicleNumber;
    private String type;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String type, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    // Encapsulation
    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    // Abstract method
    public abstract double calculateRentalCost(int days);

    // Concrete method
    public void displayVehicleDetails() {
        System.out.println("Vehicle No : " + vehicleNumber);
        System.out.println("Type       : " + type);
        System.out.println("Rate/Day   : " + rentalRate);
    }
}
