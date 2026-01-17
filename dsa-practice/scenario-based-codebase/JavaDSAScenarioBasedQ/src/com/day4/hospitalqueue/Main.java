package com.day4.hospitalqueue;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume leftover newline

        Patient[] patients = new Patient[n];

        System.out.println("\nEnter patient details:");
        System.out.println("Format: ID, Name, Criticality(1-10), ArrivalTime(min/token)\n");

        for (int i = 0; i < n; i++) {
            System.out.println("Patient " + (i + 1) + ":");

            System.out.print("Enter Patient ID: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Criticality (1-10): ");
            int criticality = sc.nextInt();

            System.out.print("Enter Arrival Time (smaller = earlier): ");
            int arrivalTime = sc.nextInt();
            sc.nextLine();

            patients[i] = new Patient(id, name, criticality, arrivalTime);

            System.out.println();
        }

        HospitalQueue queue = new HospitalQueue();

        System.out.println("---- Before Sorting (Arrival Order Entered) ----");
        queue.displayPatients(patients);

        queue.sortPatients(patients);

        System.out.println("\n---- After Sorting (Criticality + Arrival Time) ----");
        queue.displayPatients(patients);

        sc.close();
    }
}

		 
		 
		 
