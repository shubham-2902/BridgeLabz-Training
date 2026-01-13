package com.day8.homenest;
import java.util.Scanner;

public class HomeNestMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Device:");
        System.out.println("1. Light\n2. Camera\n3. Thermostat\n4. Lock");
        int choice = sc.nextInt();

        System.out.print("Enter Device ID: ");
        int id = sc.nextInt();

        Device device = switch (choice) {
            case 1 -> new Light(id);
            case 2 -> new Camera(id);
            case 3 -> new Thermostat(id);
            default -> new Lock(id);
        };

        System.out.println("\nSelect Action:");
        System.out.println("1. Turn ON\n2. Turn OFF\n3. Reset\n4. Energy Used");
        int action = sc.nextInt();

        if (action == 1) device.turnOn();
        else if (action == 2) device.turnOff();
        else if (action == 3) device.reset();
        else {
            System.out.print("Enter hours used: ");
            int hrs = sc.nextInt();
            System.out.println("Energy Used: " + device.calculateEnergyUsed(hrs) + " watts");
        }

        System.out.println();
        device.showFirmwareLogs();

        sc.close();
    }
}
