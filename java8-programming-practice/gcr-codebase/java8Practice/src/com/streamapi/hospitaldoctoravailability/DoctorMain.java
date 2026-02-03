package com.streamapi.hospitaldoctoravailability;
import java.util.*;

public class DoctorMain {
    public static void main(String[] args) {
        List<Doctor> doctors = Arrays.asList(
            new Doctor("Dr. Sharma", "Cardiologist", true),
            new Doctor("Dr. Rao", "Neurologist", false),
            new Doctor("Dr. Mehta", "Dermatologist", true),
            new Doctor("Dr. Khan", "Orthopedic", true)
        );

        doctors.stream()
               .filter(Doctor::isWeekendAvailable)
               .sorted(Comparator.comparing(Doctor::getSpecialty))
               .forEach(System.out::println);
    }
}
