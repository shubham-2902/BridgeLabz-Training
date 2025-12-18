
public class SpringSeason {

    public static void main(String[] args) 
          {

                

        
        int month;
        int day;

        // Converting command line arguments to integers
        month = Integer.parseInt(args[0]);
        day = Integer.parseInt(args[1]);

        // Checking Spring Season condition
        boolean isSpringSeason =
                (month == 3 && day >= 20) ||
                (month == 4) ||
                (month == 5) ||
                (month == 6 && day <= 20);

        // Printing result
        if (isSpringSeason) {
            System.out.println("Its a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}
