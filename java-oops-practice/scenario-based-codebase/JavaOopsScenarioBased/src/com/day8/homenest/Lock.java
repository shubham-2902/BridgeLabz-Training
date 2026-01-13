package com.day8.homenest;
public class Lock extends Device {

    public Lock(int deviceId) {
        super(deviceId, 5);
    }

    @Override
    public void turnOn() {
        setStatus(true);
        System.out.println("Lock ENABLED  (Door locked)");
    }

    @Override
    public void turnOff() {
        setStatus(false);
        System.out.println("Lock DISABLED  (Door unlocked)");
    }

    @Override
    public void reset() {
        System.out.println("Lock reset: master key refreshed.");
        addFirmwareLog("Lock reset performed.");
    }
}
