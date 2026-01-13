package com.day3.parceltracker;
public class ParcelNode {
    String stageName;
    ParcelNode next;

    public ParcelNode(String stageName) {
        this.stageName = stageName;
        this.next = null;
    }
}