package com.functionalinterface.smartvehicledashboard;
class ElectricCar implements VehicleDashboard {

    public void displaySpeed() {
        System.out.println("Speed: 60 km/h");
    }

    @Override
    public void displayBattery() {
        System.out.println("Battery Level: 85%");
    }
}
