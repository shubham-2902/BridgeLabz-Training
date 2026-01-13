package com.day3.parceltracker;
public class ParcelTracker {
    private ParcelNode head;

    // Standard addition to the end of the chain
    public void addStage(String name) {
        ParcelNode newNode = new ParcelNode(name);
        if (head == null) {
            head = newNode;
        } else {
            ParcelNode current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Inserting a custom checkpoint between nodes
    public boolean addCheckpoint(String targetStage, String newStage) {
        ParcelNode current = head;
        while (current != null && !current.stageName.equalsIgnoreCase(targetStage)) {
            current = current.next;
        }

        if (current != null) {
            ParcelNode newNode = new ParcelNode(newStage);
            newNode.next = current.next;
            current.next = newNode;
            return true;
        }
        return false;
    }

    public void displayTracking() {
        if (head == null) {
            System.out.println("\n[!] No tracking data found.");
            return;
        }

        System.out.println("\n--- Live Parcel Tracking ---");
        ParcelNode current = head;
        while (current != null) {
            System.out.print("[" + current.stageName + "]");
            
            if (current.next != null) {
                System.out.print(" -> ");
            } else if (!current.stageName.equalsIgnoreCase("Delivered")) {
                // If the list ends (null) but not at 'Delivered' stage
                System.out.print(" -> [!] ALERT: ROUTE BROKEN / PARCEL LOST");
            }
            current = current.next;
        }
        System.out.println("\n----------------------------");
    }
}