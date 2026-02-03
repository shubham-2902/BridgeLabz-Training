package com.streamapi.eventattendee;
import java.util.*;

public class AttendeeMain {
    public static void main(String[] args) {
        List<Attendee> attendees = Arrays.asList(
            new Attendee("Raju"),
            new Attendee("Riya"),
            new Attendee("Aman")
        );

        attendees.forEach(a ->
            System.out.println("Welcome to the event, " + a.getName() + "!"));
    }
}
