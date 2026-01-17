package com.day6.fleetmanager;
public class MaintenanceScheduler {

    // Merge two already sorted arrays (mileage ascending)
    // Stable: if equal mileage, left depot entry remains first
    public Vehicle[] mergeTwoDepots(Vehicle[] A, Vehicle[] B) {
        Vehicle[] merged = new Vehicle[A.length + B.length];

        int i = 0, j = 0, k = 0;

        while (i < A.length && j < B.length) {
            if (compare(A[i], B[j]) <= 0) {
                merged[k++] = A[i++];
            } else {
                merged[k++] = B[j++];
            }
        }

        while (i < A.length) merged[k++] = A[i++];
        while (j < B.length) merged[k++] = B[j++];

        return merged;
    }

    private int compare(Vehicle v1, Vehicle v2) {
        // mileage ascending
        return Integer.compare(v1.getMileage(), v2.getMileage());
    }

    public void printSchedule(Vehicle[] vehicles, int topN) {
        int limit = Math.min(topN, vehicles.length);

        System.out.println("\nMaster Maintenance Schedule (Highest priority at top):");
        for (int i = vehicles.length - 1; i >= vehicles.length - limit; i--) {
            System.out.println(vehicles[i]);
        }
    }
}
