package com.day1.smarthomeautomationsystem;

public abstract class Appliance implements Controllable {

    protected String deviceName;
    private boolean powerStatus;     // internal state
    private int powerConsumption;    // watts

    // Default power setting
    public Appliance(String deviceName, int powerConsumption) {
        this.deviceName = deviceName;
        this.powerConsumption = powerConsumption;
        this.powerStatus = false;
    }

    protected void setPowerStatus(boolean status) {
        this.powerStatus = status;
    }

    public boolean isOn() {
        return powerStatus;
    }

    public int getPowerConsumption() {
        return powerConsumption;
    }
}

