package linkedlist.circularlinkedlist.onlineticketreservationsystem;
public  class TicketCircularList {

    private TicketNode head;
    private TicketNode tail;

    /* 1️⃣ Add Ticket at End */
    public void addTicket(int id, String customer, String movie,
                          String seat, String time) {

        TicketNode newNode =
                new TicketNode(id, customer, movie, seat, time);

        if (head == null) {
            head = tail = newNode;
            newNode.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }

        System.out.println("Ticket booked successfully.");
    }

    /* 2️⃣ Remove Ticket by Ticket ID */
    public void removeTicket(int ticketId) {
        if (head == null) {
            System.out.println("No tickets to remove.");
            return;
        }

        TicketNode current = head;
        TicketNode prev = tail;

        do {
            if (current.ticketId == ticketId) {

                if (current == head && current == tail) {
                    head = tail = null;
                } else if (current == head) {
                    head = head.next;
                    tail.next = head;
                } else if (current == tail) {
                    tail = prev;
                    tail.next = head;
                } else {
                    prev.next = current.next;
                }

                System.out.println("Ticket cancelled successfully.");
                return;
            }

            prev = current;
            current = current.next;

        } while (current != head);

        System.out.println("Ticket not found!");
    }

    /* 3️⃣ Display All Tickets */
    public void displayTickets() {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        System.out.println("\nBooked Tickets:");
        do {
            displayTicket(temp);
            System.out.println("-------------------");
            temp = temp.next;
        } while (temp != head);
    }

    /* 4️⃣ Search by Customer Name */
    public void searchByCustomer(String customerName) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.customerName.equalsIgnoreCase(customerName)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for this customer.");
    }

    /* 5️⃣ Search by Movie Name */
    public void searchByMovie(String movieName) {
        if (head == null) {
            System.out.println("No tickets booked.");
            return;
        }

        TicketNode temp = head;
        boolean found = false;

        do {
            if (temp.movieName.equalsIgnoreCase(movieName)) {
                displayTicket(temp);
                found = true;
            }
            temp = temp.next;
        } while (temp != head);

        if (!found)
            System.out.println("No tickets found for this movie.");
    }

    /* 6️⃣ Count Total Tickets */
    public void countTickets() {
        if (head == null) {
            System.out.println("Total Tickets: 0");
            return;
        }

        int count = 0;
        TicketNode temp = head;

        do {
            count++;
            temp = temp.next;
        } while (temp != head);

        System.out.println("Total Tickets Booked: " + count);
    }

    /* Helper Method */
    private void displayTicket(TicketNode t) {
        System.out.println("Ticket ID: " + t.ticketId);
        System.out.println("Customer: " + t.customerName);
        System.out.println("Movie: " + t.movieName);
        System.out.println("Seat No: " + t.seatNumber);
        System.out.println("Booking Time: " + t.bookingTime);
    }
}
