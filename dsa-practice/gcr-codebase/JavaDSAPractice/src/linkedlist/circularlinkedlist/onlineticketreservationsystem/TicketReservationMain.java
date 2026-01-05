package linkedlist.circularlinkedlist.onlineticketreservationsystem;

public class TicketReservationMain {
	
	    public static void main(String[] args) {

	        TicketCircularList tickets = new TicketCircularList();

	        tickets.addTicket(101, "Ram", "Inception", "A1", "10:00 AM");
	        tickets.addTicket(102, "abc", "Inception", "A2", "10:05 AM");
	        tickets.addTicket(103, "shyam", "Avatar", "B1", "10:10 AM");

	        tickets.displayTickets();

	        System.out.println("\n Search by Customer 'Ram':");
	        tickets.searchByCustomer("Ravi");

	        System.out.println("\n Search by Movie 'abc':");
	        tickets.searchByMovie("Inception");

	        System.out.println("\n Remove Ticket ID 102:");
	        tickets.removeTicket(102);
	        tickets.displayTickets();

	        System.out.println();
	        tickets.countTickets();
	    }
	}

