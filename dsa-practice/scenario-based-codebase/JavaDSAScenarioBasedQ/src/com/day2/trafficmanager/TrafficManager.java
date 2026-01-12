package com.day2.trafficmanager;
import java.util.*;

public class TrafficManager {

    private VehicleNode head;
    private VehicleNode tail;
    private int roundaboutSize;
    private int maxCapacity;

    private Queue<String> waitingQueue;
    private int maxQueueSize;

    public TrafficManager(int maxCapacity, int maxQueueSize) {
        this.head = null;
        this.tail = null;
        this.roundaboutSize = 0;
        this.maxCapacity = maxCapacity;

        this.waitingQueue = new LinkedList<>();
        this.maxQueueSize = maxQueueSize;
    }

    // Add vehicle: if roundabout full, push to queue
    public void addVehicle(String vehicleNo) {

        // If roundabout has space, add in circular linked list
        if (roundaboutSize < maxCapacity) {
            addToRoundabout(vehicleNo);
            System.out.println("Vehicle entered roundabout: " + vehicleNo);
            return;
        }

        // Otherwise add to waiting queue (overflow check)
        if (waitingQueue.size() >= maxQueueSize) {
            System.out.println("Waiting Queue overflow. Vehicle cannot be added.");
            return;
        }

        waitingQueue.add(vehicleNo);
        System.out.println("Roundabout full. Vehicle added to waiting queue: " + vehicleNo);
    }

    // Remove vehicle from roundabout and allow one from queue (if exists)
    public void removeVehicle(String vehicleNo) {

        if (head == null) {
            System.out.println("Roundabout is empty. Underflow.");
            return;
        }

        VehicleNode current = head;
        VehicleNode prev = tail;

        do {
            if (current.vehicleNo.equalsIgnoreCase(vehicleNo)) {

                // case: only one vehicle
                if (head == tail) {
                    head = null;
                    tail = null;
                }
                // case: remove head
                else if (current == head) {
                    head = head.next;
                    tail.next = head;
                }
                // case: remove tail
                else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                }
                // case: remove middle
                else {
                    prev.next = current.next;
                }

                roundaboutSize--;
                System.out.println("Vehicle exited roundabout: " + vehicleNo);

                // if waiting queue not empty, move one vehicle into roundabout
                if (!waitingQueue.isEmpty()) {
                    String nextVehicle = waitingQueue.poll();
                    addToRoundabout(nextVehicle);
                    System.out.println("Vehicle moved from queue to roundabout: " + nextVehicle);
                }

                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Vehicle not found in roundabout: " + vehicleNo);
    }

    // Print current state
    public void printState() {
        System.out.println("\n---- Roundabout State ----");

        // roundabout
        if (head == null) {
            System.out.println("Roundabout: Empty");
        } else {
            System.out.print("Roundabout Vehicles: ");
            VehicleNode temp = head;
            do {
                System.out.print(temp.vehicleNo + " ");
                temp = temp.next;
            } while (temp != head);
            System.out.println();
        }

        // queue
        if (waitingQueue.isEmpty()) {
            System.out.println("Waiting Queue: Empty");
        } else {
            System.out.println("Waiting Queue: " + waitingQueue);
        }

        System.out.println("Roundabout Count: " + roundaboutSize + "/" + maxCapacity);
        System.out.println("Queue Count: " + waitingQueue.size() + "/" + maxQueueSize);
    }

    // Private helper: add to circular linked list
    private void addToRoundabout(String vehicleNo) {
        VehicleNode newNode = new VehicleNode(vehicleNo);

        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            tail = newNode;
            tail.next = head;
        }

        roundaboutSize++;
    }
}
