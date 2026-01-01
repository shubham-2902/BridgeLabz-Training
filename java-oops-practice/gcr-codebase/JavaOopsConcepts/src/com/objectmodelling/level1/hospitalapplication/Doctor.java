package com.objectmodelling.level1.hospitalapplication;
import java.util.ArrayList;
import java.util.List;

 public class Doctor {

    private int doctorId;
    private String doctorName;
    private List<Patient> patients = new ArrayList<>();

    Doctor(int doctorId, String doctorName) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
    }

    // Communication method
    void consult(Patient patient) {
        patients.add(patient);
        System.out.println("Doctor " + doctorName +
                " is consulting Patient " + patient.getPatientName());
    }

    void displayPatients() {
        System.out.println("Patients consulted by Dr. " + doctorName + ":");
        for (Patient p : patients) {
            System.out.println("  - " + p.getPatientName());
        }
    }

    String getDoctorName() {
        return doctorName;
    }
}


