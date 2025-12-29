package com.constructors.level1;

public class CarRental {

	    // Attributes
	    String customerName;
	    String carModel;
	    int rentalDays;

	    // Default Constructor
	    public CarRental() {
	        customerName = "Unknown";
	        carModel = "Standard";
	        rentalDays = 1;
	    }

	    // Parameterized Constructor
	    public CarRental(String customerName, String carModel, int rentalDays) {
	        this.customerName = customerName;
	        this.carModel = carModel;
	        this.rentalDays = rentalDays;
	    }

	    // Method to calculate total rental cost
	    public double calculateTotalCost() {
	        double costPerDay = 1500; // fixed rate
	        return rentalDays * costPerDay;
	    }

	    // Method to display rental details
	    public void displayRentalDetails() {
	        System.out.println("Customer Name : " + customerName);
	        System.out.println("Car Model     : " + carModel);
	        System.out.println("Rental Days   : " + rentalDays);
	        System.out.println("Total Cost    : ₹" + calculateTotalCost());
	    }

	    // Main method
	    public static void main(String[] args) {

	        CarRental rental1 = new CarRental("Suresh", "Swift", 4);
	        rental1.displayRentalDetails();
	    }
	}


