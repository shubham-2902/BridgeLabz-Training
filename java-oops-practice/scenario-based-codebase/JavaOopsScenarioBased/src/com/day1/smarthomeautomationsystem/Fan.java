package com.day1.smarthomeautomationsystem;

public class Fan extends Appliance {

    public Fan(String deviceName) {
        super(deviceName, 155); 
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println(deviceName + " fan is ON ");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println(deviceName + " fan is OFF");
    }
}
