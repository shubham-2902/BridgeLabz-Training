import java.util.Scanner;
public class MovieTicketBooking{

    //Get base ticket price based on movie type
    public static int getMoviePrice(String movieType){
        switch(movieType){
            case "action": return 200;
            case "comedy": return 150;
            case "drama": return 180;
            default: return -1;
        }
    }

    //Get seat price
    public static int getSeatPrice(String seatType){
        if(seatType.equals("gold")){
            return 100;
        }else if(seatType.equals("silver")){
            return 50;
        }else{
            return -1;
        }
    }

    //Get snacks price
    public static int getSnacksPrice(String snacks){
        if(snacks.equals("yes")){
            return 80;
        }
        return 0;
    }

    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.print("\nEnter movie type (action/comedy/drama) or exit: ");
            String movieType=sc.nextLine().toLowerCase();

            if(movieType.equals("exit")){
                System.out.println("Booking closed. Thank you!");
                break;
            }

            int moviePrice=getMoviePrice(movieType);
            if(moviePrice==-1){
                System.out.println("Invalid movie type");
                continue;
            }

            System.out.print("Enter seat type (gold/silver): ");
            String seatType=sc.nextLine().toLowerCase();
            int seatPrice=getSeatPrice(seatType);
            if(seatPrice==-1){
                System.out.println("Invalid seat type");
                continue;
            }

            System.out.print("Add snacks? (yes/no): ");
            String snacks=sc.nextLine().toLowerCase();
            int snacksPrice=getSnacksPrice(snacks);

            int totalBill=moviePrice+seatPrice+snacksPrice;

            System.out.println("------ Bill Details ------");
            System.out.println("Movie Price: "+moviePrice);
            System.out.println("Seat Price: "+seatPrice);
            System.out.println("Snacks Price: "+snacksPrice);
            System.out.println("Total Amount: "+totalBill);
        }
    }
}