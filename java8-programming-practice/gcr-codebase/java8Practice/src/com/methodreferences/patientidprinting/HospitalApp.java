package com.methodreferences.patientidprinting;
import java.util.*;

public class HospitalApp {
    public static void main(String[] args) {

        List<Patient> patients = Arrays.asList(
                new Patient(101, "Amit"),
                new Patient(102, "Riya"),
                new Patient(103, "Karan")
        );

        patients.stream()
                .map(Patient::getId)      // Method reference
                .forEach(System.out::println);  // Method reference
    }
}
