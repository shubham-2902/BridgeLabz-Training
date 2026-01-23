package com.day10.ticketbookingmgmt;
public class EventNode {

    int time;              // key (event start time)
    String eventName;      // value (event name)
    int height;            // AVL height
    EventNode left, right; // children

    public EventNode(int time, String eventName) {
        this.time = time;
        this.eventName = eventName;
        this.height = 1;
    }
}
