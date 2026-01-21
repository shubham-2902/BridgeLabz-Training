package com.queueinterface.hospitaltriagesystem;
import java.util.*;

class Patient {
    String name;
    int severity;

    public Patient(String name, int severity) {
        this.name = name;
        this.severity = severity;
    }

    @Override
    public String toString() {
        return name + " (Severity: " + severity + ")";
    }
}

public class HospitalTriageSystem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Higher severity first => Max Heap behavior using comparator
        PriorityQueue<Patient> pq = new PriorityQueue<>(
                (p1, p2) -> Integer.compare(p2.severity, p1.severity)
        );

        System.out.print("Enter number of patients: ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for patient " + (i + 1));

            System.out.print("Name: ");
            String name = sc.nextLine();

            System.out.print("Severity (1-10): ");
            int severity = sc.nextInt();
            sc.nextLine(); // consume newline

            pq.add(new Patient(name, severity));
        }

        System.out.println("\n--- Treatment Order ---");
        while (!pq.isEmpty()) {
            Patient next = pq.remove();
            System.out.println("Treating: " + next);
        }

        sc.close();
    }
}
