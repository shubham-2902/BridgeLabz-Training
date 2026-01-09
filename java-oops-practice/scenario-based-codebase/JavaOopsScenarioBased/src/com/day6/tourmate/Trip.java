package com.day6.tourmate;
public abstract class Trip implements IBookable {

    protected String destination;
    protected int duration; // days

    private double budget;  // total budget (encapsulated)

    protected Transport transport;
    protected Hotel hotel;
    protected Activity activity;

    // Constructor creates a complete trip package
    public Trip(String destination, int duration,
                Transport transport, Hotel hotel, Activity activity) {

        this.destination = destination;
        this.duration = duration;
        this.transport = transport;
        this.hotel = hotel;
        this.activity = activity;

        calculateBudget();
    }

    // Budget calculation hidden internally
    private void calculateBudget() {
        budget = transport.getCost()
               + hotel.getCost()
               + activity.getCost();
    }

    public double getBudget() {
        return budget;
    }
}
