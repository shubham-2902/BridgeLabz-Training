package com.constructors.level1;

public class HotelBooking {

	    // Attributes
	    String guestName;
	    String roomType;
	    int nights;

	    // Default Constructor
	    public HotelBooking() {
	        guestName = "Guest";
	        roomType = "Standard";
	        nights = 1;
	    }

	    // Parameterized Constructor
	    public HotelBooking(String guestName, String roomType, int nights) {
	        this.guestName = guestName;
	        this.roomType = roomType;
	        this.nights = nights;
	    }

	    // Copy Constructor
	    public HotelBooking(HotelBooking other) {
	        this.guestName = other.guestName;
	        this.roomType = other.roomType;
	        this.nights = other.nights;
	    }

	    // Method to display booking details
	    public void displayBooking() {
	        System.out.println("Guest Name : " + guestName);
	        System.out.println("Room Type  : " + roomType);
	        System.out.println("Nights     : " + nights);
	    }

	    // Main method
	    public static void main(String[] args) {

	        // Booking using default constructor
	        HotelBooking booking1 = new HotelBooking();
	        System.out.println("Default Booking:");
	        booking1.displayBooking();

	        System.out.println();

	        // Booking using parameterized constructor
	        HotelBooking booking2 = new HotelBooking("Amit", "Deluxe", 3);
	        System.out.println("Parameterized Booking:");
	        booking2.displayBooking();

	        System.out.println();

	        // Booking using copy constructor
	        HotelBooking booking3 = new HotelBooking(booking2);
	        System.out.println("Copied Booking:");
	        booking3.displayBooking();
	    }
	}


