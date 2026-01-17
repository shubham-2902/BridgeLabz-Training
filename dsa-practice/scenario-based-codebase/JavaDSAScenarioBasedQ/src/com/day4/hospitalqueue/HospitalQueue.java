package com.day4.hospitalqueue;

public class HospitalQueue {

    // Bubble Sort:
    // Priority 1: Criticality high → low
    // Priority 2: Arrival time low → high (earlier first)
    public void sortPatients(Patient[] patients) {
        int n = patients.length;

        for (int i = 0; i < n - 1; i++) {
            boolean swapped = false;

            for (int j = 0; j < n - 1 - i; j++) {

                Patient p1 = patients[j];
                Patient p2 = patients[j + 1];

                // Condition to swap
                if (shouldSwap(p1, p2)) {
                    Patient temp = patients[j];
                    patients[j] = patients[j + 1];
                    patients[j + 1] = temp;

                    swapped = true;
                }
            }

            // Optimization: if no swaps, already sorted
            if (!swapped) break;
        }
    }

    // Decide swap conditions
    private boolean shouldSwap(Patient p1, Patient p2) {
        // If p1 has lower criticality, it should come later
        if (p1.getCriticality() < p2.getCriticality()) {
            return true;
        }

        // If criticality same, earlier arrival should come first
        if (p1.getCriticality() == p2.getCriticality() &&
                p1.getArrivalTime() > p2.getArrivalTime()) {
            return true;
        }

        return false;
    }

    public void displayPatients(Patient[] patients) {
        for (Patient p : patients) {
            System.out.println(p);
        }
    }
}


	
	
	

