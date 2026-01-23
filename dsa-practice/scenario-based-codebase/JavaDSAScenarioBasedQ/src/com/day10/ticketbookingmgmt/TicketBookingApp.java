package com.day10.ticketbookingmgmt;
import java.util.*;

public class TicketBookingApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EventAVLTree events = new EventAVLTree();

        // To cancel correctly, we must know exact (time, eventName)
        // We'll store latest event info in a map: eventName -> time
        HashMap<String, Integer> eventTimeMap = new HashMap<>();

        while (true) {

            System.out.println("\n====== ONLINE TICKET BOOKING MENU ======");
            System.out.println("1. Insert/Add Event");
            System.out.println("2. Cancel Event (Delete)");
            System.out.println("3. Show Events in Order (Upcoming)");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {

                case 1: {
                    System.out.print("Enter event name: ");
                    String eventName = sc.nextLine();

                    if (eventTimeMap.containsKey(eventName)) {
                        System.out.println("Event already exists! Use a different name.");
                        break;
                    }

                    System.out.print("Enter start time (HHMM format e.g., 0930 or 1830): ");
                    int time = sc.nextInt();

                    // Validation: minutes should be 00-59
                    int minutes = time % 100;
                    int hours = time / 100;
                    if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59) {
                        System.out.println("Invalid time format. Try again.");
                        break;
                    }

                    // insert into AVL + store in map
                    events.insertEvent(time, eventName);
                    eventTimeMap.put(eventName, time);

                    System.out.println("Event added successfully at " + EventAVLTree.formatTime(time));
                    break;
                }

                case 2: {
                    System.out.print("Enter event name to cancel: ");
                    String eventName = sc.nextLine();

                    if (!eventTimeMap.containsKey(eventName)) {
                        System.out.println("Event not found!");
                        break;
                    }

                    int time = eventTimeMap.get(eventName);

                    // delete from AVL and map
                    events.cancelEvent(time, eventName);
                    eventTimeMap.remove(eventName);

                    System.out.println("Event cancelled successfully.");
                    break;
                }

                case 3: {
                    events.displayUpcomingEvents();
                    break;
                }

                case 4:
                    System.out.println("Exiting... Thank you!");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
