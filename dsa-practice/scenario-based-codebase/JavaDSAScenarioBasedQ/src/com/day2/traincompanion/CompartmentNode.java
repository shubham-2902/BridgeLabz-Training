package com.day2.traincompanion;
public class CompartmentNode {
    String name;          // Example: C1, C2, Pantry, WiFi Coach
    String service;       // Example: "pantry", "wifi", "none"
    CompartmentNode prev;
    CompartmentNode next;

    public CompartmentNode(String name, String service) {
        this.name = name;
        this.service = service;
        this.prev = null;
        this.next = null;
    }

    @Override
    public String toString() {
        return name + " (Service: " + service + ")";
    }
}
