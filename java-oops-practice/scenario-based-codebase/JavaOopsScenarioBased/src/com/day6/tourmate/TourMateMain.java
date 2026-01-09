package com.day6.tourmate;
import java.util.Scanner;

public class TourMateMain {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.println("=== TourMate – Smart Travel Planner ===");

	        System.out.println("Select Trip Type:");
	        System.out.println("1. Domestic");
	        System.out.println("2. International");
	        int choice = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Destination: ");
	        String destination = sc.nextLine();

	        System.out.print("Enter Duration (days): ");
	        int duration = sc.nextInt();
	        sc.nextLine();

	        // ---- Optional Services ----
	        System.out.print("Do you want Transport? (yes/no): ");
	        boolean wantTransport = sc.nextLine().equalsIgnoreCase("yes");

	        System.out.print("Do you want Hotel? (yes/no): ");
	        boolean wantHotel = sc.nextLine().equalsIgnoreCase("yes");

	        System.out.print("Do you want Activities? (yes/no): ");
	        boolean wantActivity = sc.nextLine().equalsIgnoreCase("yes");

	        Transport transport = wantTransport ? new Transport() : null;
	        Hotel hotel = wantHotel ? new Hotel() : null;
	        Activity activity = wantActivity ? new Activity() : null;

	        Trip trip;
	        if (choice == 1) {
	            trip = new DomesticTrip(destination, duration, transport, hotel, activity);
	        } else {
	            trip = new InternationalTrip(destination, duration, transport, hotel, activity);
	        }

	        System.out.println("\n--- Booking Summary ---");
	        trip.book();

	        sc.close();
	    }
	}
