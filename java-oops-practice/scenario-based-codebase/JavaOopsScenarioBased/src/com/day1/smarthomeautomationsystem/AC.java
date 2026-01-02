package com.day1.smarthomeautomationsystem;

public class AC extends Appliance {

    public AC(String deviceName) {
        super(deviceName, 1900); // high power
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println(deviceName + " AC is ON ");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println(deviceName + " AC is OFF");
    }
}
