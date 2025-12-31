import java.util.*;

public class TrainReservationSystem{
  static int totalSeat = 5;
  static int currBooked =0;
	
  public static void ticketBook(String ticketType){
	  System.out.println(ticketType+" is book successfull.\n");
	  currBooked++;
  }	
  public static void main(String args[]){
     Scanner sc = new Scanner(System.in);
	 System.out.println("----------Welcome to Train Reservation System-----------");
	 char choice;
	 
	   do{
		 
		 if(totalSeat==currBooked){
			 System.out.println("/n Seat is not available. /n");
			 break;
		 }
		 
		 System.out.println("Choose Seat type:");
		 System.out.println("Avaible seat is "+(totalSeat-currBooked));
		 System.out.println("1.General Seat -> price: 30 \n2.Sleeper Seat -> price:430 \n3.Third AC Ticket -> price:1100\n4.Second AC Ticket -> price:1850\n5.First AC Ticket -> price:2100");
		 
		 int userChoice = sc.nextInt();
		 switch(userChoice){
			 case 1: ticketBook("< General Seat >");
			         break;
			 case 2: ticketBook("< Sleeper Seat >");
			         break; 
			 case 3: ticketBook("< Third Ac Seat >");
			         break; 
 			 case 4: ticketBook("< Second Ac Seat >");
			         break; 
             case 5: ticketBook("< First Ac Seat >");
			         break;
             default: System.out.println("Invalid input."); 

             			
		 }
		 System.out.println("Do you want to book again?(y/n)");
         choice = sc.next().charAt(0);
	 }while(choice == 'Y' || choice == 'y');
	    System.out.println("Happy journey \nThank you....");
  }
}