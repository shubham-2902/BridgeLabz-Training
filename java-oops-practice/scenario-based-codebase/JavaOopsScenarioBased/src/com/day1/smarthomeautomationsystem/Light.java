package com.day1.smarthomeautomationsystem;

public class Light extends Appliance {

    public Light(String deviceName) {
        super(deviceName, 60); // default 60W
    }

    @Override
    public void turnOn() {
        setPowerStatus(true);
        System.out.println(deviceName + " light is ON ");
    }

    @Override
    public void turnOff() {
        setPowerStatus(false);
        System.out.println(deviceName + " light is OFF");
    }
}
