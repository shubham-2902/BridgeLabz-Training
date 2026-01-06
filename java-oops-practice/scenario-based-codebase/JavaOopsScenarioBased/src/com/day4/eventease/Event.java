package com.day4.eventease;
public abstract class Event implements ISchedulable {

    protected String eventName;
    protected String location;
    protected String date;
    protected int attendees;

    private final int eventId;
    private double price;

    public Event(int eventId, String eventName, String location,
                 String date, int attendees, double basePrice) {
        this.eventId = eventId;
        this.eventName = eventName;
        this.location = location;
        this.date = date;
        this.attendees = attendees;
        this.price = basePrice;
    }

    protected void updatePrice(double amount) {
        price += amount;
    }

    protected double getPrice() {
        return price;
    }

    public int getEventId() {
        return eventId;
    }
}
