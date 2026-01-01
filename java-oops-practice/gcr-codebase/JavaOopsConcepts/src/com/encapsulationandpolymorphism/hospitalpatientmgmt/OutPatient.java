package com.encapsulationandpolymorphism.hospitalpatientmgmt;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
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
