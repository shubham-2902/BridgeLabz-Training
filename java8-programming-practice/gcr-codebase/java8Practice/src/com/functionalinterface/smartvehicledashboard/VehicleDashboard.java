package com.functionalinterface.smartvehicledashboard;
interface VehicleDashboard {

    void displaySpeed();

    default void displayBattery() {
        System.out.println("Battery info not available for this vehicle.");
    }
}
