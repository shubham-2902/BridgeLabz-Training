package com.day5.parkease;
public class ParkingRecord {

    private String vehicleNumber;
    private int hoursParked;
    private double totalCharge;

    public ParkingRecord(String vehicleNumber, int hoursParked, double totalCharge) {
        this.vehicleNumber = vehicleNumber;
        this.hoursParked = hoursParked;
        this.totalCharge = totalCharge;
    }

    public void showRecord() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Hours Parked: " + hoursParked);
        System.out.println("Total Charge: Rs " + totalCharge);
    }
}
