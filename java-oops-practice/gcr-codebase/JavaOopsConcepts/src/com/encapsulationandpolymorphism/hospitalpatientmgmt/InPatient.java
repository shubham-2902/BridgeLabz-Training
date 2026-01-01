package com.encapsulationandpolymorphism.hospitalpatientmgmt;

public class InPatient extends Patient implements MedicalRecord {

    private int numberOfDays;
    private double dailyCharge;

    public InPatient(int id, String name, int age, int days, double dailyCharge) {
        super(id, name, age);
        this.numberOfDays = days;
        this.dailyCharge = dailyCharge;
    }

    @Override
    public double calculateBill() {
        return numberOfDays * dailyCharge;
    }

    @Override
    public void addRecord(String diagnosis, String medicalHistory) {
        setDiagnosis(diagnosis);
        setMedicalHistory(medicalHistory);
    }

    @Override
    public void viewRecords() {
        System.out.println("Diagnosis       : " + getDiagnosis());
        System.out.println("Medical History : " + getMedicalHistory());
    }
}
