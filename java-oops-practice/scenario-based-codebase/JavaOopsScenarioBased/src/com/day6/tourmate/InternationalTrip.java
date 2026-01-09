package com.day6.tourmate;
public class InternationalTrip extends Trip {

    public InternationalTrip(String destination, int duration,
                             Transport t, Hotel h, Activity a) {
        super(destination, duration, t, h, a);
    }

    @Override
    public void book() {
        System.out.println("International Trip Booked!");
        System.out.println("Destination: " + destination);
        System.out.println("Duration: " + duration + " days");
        System.out.println("Total Budget: Rs " + getBudget());
        System.out.println("Note: Passport & Visa required");
    }

    @Override
    public void cancel() {
        System.out.println("International trip cancelled.");
    }
}
