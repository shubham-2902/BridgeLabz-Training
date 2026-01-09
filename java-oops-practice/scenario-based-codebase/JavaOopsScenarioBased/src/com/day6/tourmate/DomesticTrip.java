package com.day6.tourmate;
public class DomesticTrip extends Trip {

    public DomesticTrip(String destination, int duration,
                        Transport t, Hotel h, Activity a) {
        super(destination, duration, t, h, a);
    }

    @Override
    public void book() {
        System.out.println("Domestic Trip Booked!");
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: Rs " + getBudget());
    }

    @Override
    public void cancel() {
        System.out.println("Domestic trip cancelled.");
    }
}
