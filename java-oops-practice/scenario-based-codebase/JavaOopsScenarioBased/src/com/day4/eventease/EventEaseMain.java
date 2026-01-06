package com.day4.eventease;
import java.util.Scanner;

public class EventEaseMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Organizer Name: ");
        String userName = sc.nextLine();

        System.out.print("Enter Organizer Email: ");
        String email = sc.nextLine();

        User user = new User(userName, email);

        System.out.println("\nSelect Event Type:[Enter only serial number]");
        System.out.println("1. Birthday");
        System.out.println("2. Conference");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Event Name: ");
        String eventName = sc.nextLine();

        System.out.print("Location: ");
        String location = sc.nextLine();

        System.out.print("Date: ");
        String date = sc.nextLine();

        System.out.print("Number of Attendees: ");
        int attendees = sc.nextInt();
        sc.nextLine();//clear the buffer or leftover line

        System.out.print("Add Extra Service?[Reply one( yes or no)] ");
        String extra = sc.nextLine();
        extra= extra.toLowerCase();

        Event event;
        if (choice == 1) {
            event = new BirthdayEvent(101, eventName, location, date, attendees, extra);
        } else {
            event = new ConferenceEvent(201, eventName, location, date, attendees, extra);
        }

        System.out.println("\n--- Scheduling Event for " + user.getName() + " ---");
        event.schedule();

        sc.close();
    }
}
