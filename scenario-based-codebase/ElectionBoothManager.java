import java.util.Scanner;

public class ElectionBoothManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int vote1 = 0, vote2 = 0, vote3 = 0;

        while (true) {
            System.out.print("Enter age (Enter -1 to exit): ");
            int age = sc.nextInt();

            // Exit condition
            if (age == -1) {
                break;
            }

            // Eligibility check
            if (age >= 18) {
                System.out.println("You are eligible to vote.");
                System.out.print("Vote for Candidate (1 / 2 / 3): ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        vote1++;
                        System.out.println("Vote recorded for Candidate 1");
                        break;
                    case 2:
                        vote2++;
                        System.out.println("Vote recorded for Candidate 2");
                        break;
                    case 3:
                        vote3++;
                        System.out.println("Vote recorded for Candidate 3");
                        break;
                    default:
                        System.out.println("Invalid vote choice!");
                }
            } else {
                System.out.println("You are not eligible to vote.");
            }

            System.out.println("--------------------------------");
        }

        // Final Results
        System.out.println("\nElection Results:");
        System.out.println("Candidate 1 Votes: " + vote1);
        System.out.println("Candidate 2 Votes: " + vote2);
        System.out.println("Candidate 3 Votes: " + vote3);
         //Declaring the winners 
         int max;
         max = vote1>vote2?(vote1>vote3?vote1:vote3):(vote2>vote3?vote2:vote3);
         if(max==vote1){System.out.println("Candidate 1 is winner");}
         else if(max== vote2){System.out.println("Candidate 2 is winner");}
         else {System.out.println("Candidate 3 is winner");}   

        sc.close();
    }
}
