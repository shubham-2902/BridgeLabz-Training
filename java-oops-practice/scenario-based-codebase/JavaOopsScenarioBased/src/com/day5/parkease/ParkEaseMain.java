package com.day5.parkease;
import java.util.Scanner;

public class ParkEaseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ---------- Vehicle ----------
        System.out.println("Select Vehicle Type:");
        System.out.println("1. Car");
        System.out.println("2. Bike");
        System.out.println("3. Truck");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Vehicle Number: ");
        String vehicleNumber = sc.nextLine();

        Vehicle vehicle;
        if (choice == 1) {
            vehicle = new Car(vehicleNumber);
        } else if (choice == 2) {
            vehicle = new Bike(vehicleNumber);
        } else {
            vehicle = new Truck(vehicleNumber);
        }

        // ---------- Slot ----------
        ParkingSlot slot =
                new ParkingSlot(101, "City Center", vehicle.getVehicleType());

        System.out.println("\n--- Slot Details ---");
        slot.showSlotInfo();

        if (!slot.canPark(vehicle)) {
            System.out.println(" Vehicle not allowed or slot occupied.");
            sc.close();
            return;
        }

        slot.parkVehicle();
        System.out.println(" Vehicle parked successfully.");

        // ---------- Parking Duration ----------
        System.out.print("\nEnter Parking Duration (hours): ");
        int hours = sc.nextInt();

        double charges = vehicle.calculateCharges(hours);

        ParkingRecord record =
                new ParkingRecord(vehicleNumber, hours, charges);

        slot.releaseSlot();

        // ---------- Output ----------
        System.out.println("\n--- Parking Receipt ---");
        record.showRecord();

        sc.close();
    }
}
