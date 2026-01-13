package com.day8.homenest;
public class Thermostat extends Device {

    public Thermostat(int deviceId) {
        super(deviceId, 1500);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Thermostat ON  (Temp mode active)");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Thermostat OFF ");
    }

    @Override
    public void reset() {
        System.out.println("Thermostat reset: temperature to 24°C default.");
        addFirmwareLog("Thermostat reset performed.");
    }
}
