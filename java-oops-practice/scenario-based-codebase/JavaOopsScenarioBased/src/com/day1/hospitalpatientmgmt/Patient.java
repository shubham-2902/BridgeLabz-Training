package com.day1.hospitalpatientmgmt;

public abstract class Patient {

    protected int patientId;
    protected String name;
    protected int age;

    private String medicalHistory; // sensitive data

    // Constructor
    public Patient(int patientId, String name, int age, String medicalHistory) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.medicalHistory = medicalHistory;
    }

    // Encapsulation
    public String getMedicalHistory() {
        return medicalHistory;
    }

    public void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    // Safe public summary
    public String getSummary() {
        return "Patient ID: " + patientId + ", Name: " + name + ", Age: " + age;
    }

    // Polymorphism
    public abstract void displayInfo();
}
