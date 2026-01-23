package com.day10.hospitalqueuemgmt;
public class PatientNode {

    int checkInTime;               // Key (arrival/check-in time)
    String patientName;            // Value (patient name)
    int height;                    // AVL height
    PatientNode left, right;       // children

    public PatientNode(int checkInTime, String patientName) {
        this.checkInTime = checkInTime;
        this.patientName = patientName;
        this.height = 1;
    }
}
