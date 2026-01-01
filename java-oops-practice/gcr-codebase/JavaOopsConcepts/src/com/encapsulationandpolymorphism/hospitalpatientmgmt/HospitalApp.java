package com.encapsulationandpolymorphism.hospitalpatientmgmt;

import java.util.ArrayList;
import java.util.List;

public class HospitalApp {

    public static void main(String[] args) {

        List<Patient> patients = new ArrayList<>();

        patients.add(new InPatient(101, "Ramesh", 45, 5, 3000));
        patients.add(new OutPatient(102, "Sita", 30, 800));

        for (Patient patient : patients) {

            patient.getPatientDetails();

            if (patient instanceof MedicalRecord) {
                MedicalRecord record = (MedicalRecord) patient;
                record.addRecord("General Checkup", "No prior complications");
                record.viewRecords();
            }

            System.out.println("Total Bill: " + patient.calculateBill());
            System.out.println("----------------------------------");
        }
    }
}
