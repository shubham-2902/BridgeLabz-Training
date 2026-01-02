package com.day1.hospitalpatientmgmt;

public class InPatient extends Patient {

    private int numberOfDays;

    // Emergency admission
    public InPatient(int patientId, String name, int age, String medicalHistory, int numberOfDays) {
        super(patientId, name, age, medicalHistory);
        this.numberOfDays = numberOfDays;
    }

    @Override
    public void displayInfo() {
        System.out.println("In-Patient Details:");
        System.out.println(getSummary());
        System.out.println("Days Admitted: " + numberOfDays);
    }

    public int getNumberOfDays() {
        return numberOfDays;
    }
}
