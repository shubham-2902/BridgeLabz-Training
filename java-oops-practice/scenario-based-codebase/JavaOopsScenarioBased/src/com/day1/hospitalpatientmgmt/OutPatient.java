package com.day1.hospitalpatientmgmt;

public class OutPatient extends Patient {

    private double consultationFee;

    // Normal admission
    public OutPatient(int patientId, String name, int age, String medicalHistory, double consultationFee) {
        super(patientId, name, age, medicalHistory);
        this.consultationFee = consultationFee;
    }

    @Override
    public void displayInfo() {
        System.out.println("Out-Patient Details:");
        System.out.println(getSummary());
        System.out.println("Consultation Fee: Rs " + consultationFee);
    }

    public double getConsultationFee() {
        return consultationFee;
    }
}
