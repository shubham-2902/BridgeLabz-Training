package com.encapsulationandpolymorphism.hospitalpatientmgmt;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // Sensitive data (encapsulated)
    private String diagnosis;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // Encapsulation (controlled access)
    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected void setMedicalHistory(String medicalHistory) {
        this.medicalHistory = medicalHistory;
    }

    protected String getDiagnosis() {
        return diagnosis;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }

    // Abstract method
    public abstract double calculateBill();

    // Concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID : " + patientId);
        System.out.println("Name       : " + name);
        System.out.println("Age        : " + age);
    }
}
