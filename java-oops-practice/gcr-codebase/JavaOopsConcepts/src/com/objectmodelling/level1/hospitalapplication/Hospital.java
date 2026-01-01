package com.objectmodelling.level1.hospitalapplication;
import java.util.ArrayList;
import java.util.List;

 public class Hospital {

    private String hospitalName;
    private List<Doctor> doctors = new ArrayList<>();
    private List<Patient> patients = new ArrayList<>();

    Hospital(String hospitalName) {
        this.hospitalName = hospitalName;
    }

    void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    void addPatient(Patient patient) {
        patients.add(patient);
    }

    void displayHospitalInfo() {
        System.out.println("Hospital: " + hospitalName);

        System.out.println("\nDoctors:");
        for (Doctor d : doctors) {
            System.out.println("  - Dr. " + d.getDoctorName());
        }

        System.out.println("\nPatients:");
        for (Patient p : patients) {
            System.out.println("  - " + p.getPatientName());
        }
    }
}


