package com.day1.hospitalpatientmgmt;

public class HospitalApp {

    public static void main(String[] args) {

        Doctor doctor = new Doctor(101, "Dr. Sharma", "Cardiology");
        doctor.displayInfo();

        System.out.println();

        // Polymorphism
        Patient p1 = new InPatient(1, "Rahul", 45, "Heart Issue", 5);
        Patient p2 = new OutPatient(2, "Anita", 30, "Fever", 500);

        p1.displayInfo();
        System.out.println();
        p2.displayInfo();

        System.out.println();

        Bill bill = new Bill(10000, 0.18, 1000);
        System.out.println("Total Bill Amount: Rs " + bill.calculatePayment());
    }
}
