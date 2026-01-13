package com.day8.homenest;
public class Light extends Device {

    public Light(int deviceId) {
        super(deviceId, 60);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Light ON ");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Light OFF ");
    }

    @Override
    public void reset() {
        System.out.println("Light reset: brightness set to default.");
        addFirmwareLog("Light reset performed.");
    }
}
