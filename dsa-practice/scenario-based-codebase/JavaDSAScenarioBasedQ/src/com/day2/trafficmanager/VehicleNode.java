package com.day2.trafficmanager;
public class VehicleNode {
    String vehicleNo;
    VehicleNode next;

    public VehicleNode(String vehicleNo) {
        this.vehicleNo = vehicleNo;
        this.next = null;
    }
}
