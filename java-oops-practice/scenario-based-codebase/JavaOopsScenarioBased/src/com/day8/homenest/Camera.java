package com.day8.homenest;
public class Camera extends Device {

    public Camera(int deviceId) {
        super(deviceId, 20);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Camera ON (Recording started)");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Camera OFF ");
    }

    @Override
    public void reset() {
        System.out.println("Camera reset: cleared cache + restarted.");
        addFirmwareLog("Camera reset performed.");
    }
}
