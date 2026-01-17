package com.day4.eventmanager;
public class Ticket {
    private String ticketId;
    private String eventName;
    private double price;

    public Ticket(String ticketId, String eventName, double price) {
        this.ticketId = ticketId;
        this.eventName = eventName;
        this.price = price;
    }

    public String getTicketId() {
        return ticketId;
    }

    public String getEventName() {
        return eventName;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "TicketID: " + ticketId + ", Event: " + eventName + ", Price: " + price;
    }
}
