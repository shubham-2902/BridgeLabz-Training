package com.constructors.level1;

public class Vehicle {


	    // Instance variables
	    String ownerName;
	    String vehicleType;

	    // Class variable
	    static double registrationFee = 1500.0;

	    // Constructor
	    Vehicle(String ownerName, String vehicleType) {
	        this.ownerName = ownerName;
	        this.vehicleType = vehicleType;
	    }

	    // Instance method
	    void displayVehicleDetails() {
	        System.out.println("Owner Name        : " + ownerName);
	        System.out.println("Vehicle Type      : " + vehicleType);
	        System.out.println("Registration Fee  : ₹" + registrationFee);
	        System.out.println();
	    }

	    // Class method
	    static void updateRegistrationFee(double newFee) {
	        registrationFee = newFee;
	    }

	    // main method
	    public static void main(String[] args) {
	        Vehicle v1 = new Vehicle("Rahul", "Car");
	        Vehicle v2 = new Vehicle("Anita", "Bike");

	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();

	        // Update registration fee
	        Vehicle.updateRegistrationFee(2000);

	        System.out.println("After updating registration fee:\n");
	        v1.displayVehicleDetails();
	        v2.displayVehicleDetails();
	    }
	}


