package com.workshop.smartcitytransportmgmt;
public interface TransportService {

    void startService();
    void stopService();
    double getFare(double distance);

    // Default Method (Java 8)
    default void printServiceDetails() {
        System.out.println("Service running: " + this.getClass().getSimpleName());
    }
}
