package com.day8.homenest;
import java.util.ArrayList;

public abstract class Device implements IControllable {

    protected int deviceId;
    private boolean status;              // cannot modify externally
    protected double energyUsagePerHour; // watts/hr

    private ArrayList<String> firmwareLogs = new ArrayList<>(); // secured logs

    public Device(int deviceId, double energyUsagePerHour) {
        this.deviceId = deviceId;
        this.energyUsagePerHour = energyUsagePerHour;
        this.status = false;
        addFirmwareLog("Device registered successfully.");
    }

    public boolean isOn() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    protected void addFirmwareLog(String log) { // internal only
        firmwareLogs.add(log);
    }

    public void showFirmwareLogs() { // read-only access
        System.out.println("--- Firmware Logs ---");
        for (String log : firmwareLogs) System.out.println(log);
    }

    // Operators for energy usage
    public double calculateEnergyUsed(int hours) {
        return energyUsagePerHour * hours;
    }
}
