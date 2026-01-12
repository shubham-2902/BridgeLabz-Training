package com.day1.ambulanceroute;
import java.util.*;

public class HospitalRoute {

    private UnitNode head;
    private UnitNode tail;

    public HospitalRoute() {
        head = null;
        tail = null;
    }

    // Add unit in circular list
    public void addUnit(String unitName) {
        UnitNode newNode = new UnitNode(unitName);

        if (head == null) {
            head = newNode;
            tail = newNode;
            tail.next = head; // circular connection
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head; // maintain circular
        }
        System.out.println("Unit added: " + unitName);
    }

    // Display route (one full cycle)
    public void displayRoute() {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        System.out.println("\nHospital Circular Route:");
        UnitNode temp = head;

        do {
            System.out.println(temp.unitName + " | Available: " + temp.available);
            temp = temp.next;
        } while (temp != head);
    }

    // Update availability
    public void setAvailability(String unitName, boolean status) {
        UnitNode node = findUnit(unitName);

        if (node == null) {
            System.out.println("Unit not found: " + unitName);
            return;
        }

        node.available = status;
        System.out.println("Availability updated: " + unitName + " = " + status);
    }

    // Redirect patient: rotate until available
    public void redirectPatient(String startUnit) {
        if (head == null) {
            System.out.println("No units available.");
            return;
        }

        UnitNode startNode = findUnit(startUnit);

        if (startNode == null) {
            System.out.println("Start unit not found: " + startUnit);
            return;
        }

        UnitNode temp = startNode;

        System.out.println("\nAmbulance started at: " + startNode.unitName);

        do {
            System.out.println("Checking: " + temp.unitName);

            if (temp.available) {
                System.out.println("Patient redirected to: " + temp.unitName);
                return;
            }

            temp = temp.next;

        } while (temp != startNode);

        System.out.println("No unit available. Patient cannot be redirected.");
    }

    // Remove a unit for maintenance
    public void removeUnit(String unitName) {
        if (head == null) {
            System.out.println("Route is empty.");
            return;
        }

        UnitNode current = head;
        UnitNode prev = tail;

        do {
            if (current.unitName.equalsIgnoreCase(unitName)) {

                // Case 1: only one node
                if (head == tail) {
                    head = null;
                    tail = null;
                    System.out.println("Removed unit. Route is now empty.");
                    return;
                }

                // Case 2: removing head
                if (current == head) {
                    head = head.next;
                    tail.next = head;
                }

                // Case 3: removing tail
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }

                // Case 4: removing middle node
                else {
                    prev.next = current.next;
                }

                System.out.println("Unit removed for maintenance: " + unitName);
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Unit not found: " + unitName);
    }

    // Helper method
    private UnitNode findUnit(String unitName) {
        if (head == null) return null;

        UnitNode temp = head;

        do {
            if (temp.unitName.equalsIgnoreCase(unitName)) {
                return temp;
            }
            temp = temp.next;
        } while (temp != head);

        return null;
    }
}
