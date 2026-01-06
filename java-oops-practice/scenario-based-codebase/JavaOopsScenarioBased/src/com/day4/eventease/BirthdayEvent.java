package com.day4.eventease;
public class BirthdayEvent extends Event {

    public BirthdayEvent(int id, String name, String location,
                         String date, int attendees, String decoration) {
        super(id, name, location, date, attendees, 5000);
        if (decoration.equals("yes")) updatePrice(2000);
    }

    @Override
    public void schedule() {
        System.out.println("Birthday! event scheduled on " + date);
        System.out.println("Total Cost: Rs " + getPrice());
    }

    @Override
    public void reschedule(String newDate) {
        date = newDate;
        System.out.println("Birthday event rescheduled to " + date);
    }

    @Override
    public void cancel() {
        System.out.println("Birthday event cancelled.");
    }
}
