package com.day1.ambulanceroute;
public class UnitNode {
    String unitName;
    boolean available;
    UnitNode next;

    public UnitNode(String unitName) {
        this.unitName = unitName;
        this.available = true;   // default available
        this.next = null;
    }
}
