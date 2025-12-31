//19. Bus Route Distance Tracker
//Each stop adds distance.
//Ask if the passenger wants to get off at a stop.
 //Use a while-loop with a total distance tracker.
// Exit on user confirmation.

import java.util.Scanner;
public class BusRouteTracker
{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalRouteDistance = 50;   // predefined total distance
        int stopDistance = 5;          // distance per stop
        int coveredDistance = 0;
        int stopNumber = 1;
        char choice = 'n';

        System.out.println("Bus started its journey");

        while (coveredDistance < totalRouteDistance) {

            coveredDistance = coveredDistance + stopDistance;

            System.out.println("Stop " + stopNumber +
                    " reached | Distance covered: " + coveredDistance + " km");
   
  if (coveredDistance == totalRouteDistance) {
                System.out.println("Bus reached final destination");
                break;}


            System.out.print("Do you want to get off here? (y/n): Press yes or no any other options will lead to continuation of journey ");
            choice = sc.next().charAt(0);

            if (choice == 'y' || choice == 'Y') {
                break;
            }

            stopNumber++;
        }

        System.out.println("Passenger got off.");
        System.out.println("Total distance travelled: " + coveredDistance + " km");

        sc.close();
    }
}
