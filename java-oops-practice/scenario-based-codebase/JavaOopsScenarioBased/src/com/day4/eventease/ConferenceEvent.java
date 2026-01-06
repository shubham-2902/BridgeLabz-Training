package com.day4.eventease;
public class ConferenceEvent extends Event {

    public ConferenceEvent(int id, String name, String location,
                            String date, int attendees, String catering) {
        super(id, name, location, date, attendees, 20000);
        if (catering.equals("yes")) updatePrice(10000);
    }

    @Override
    public void schedule() {
        System.out.println("Conference scheduled on " + date);
        System.out.println("Total Cost: Rs " + getPrice());
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Conference rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Conference cancelled.");
    }
}
