import java.util.Scanner;


public class RocketLaunchWithFor {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

       

        // Taking input
        System.out.print("Enter countdown start value: ");
         int counter = input.nextInt();

        // Countdown using for loop
        for (int i = counter; i >= 1; i--) {
            System.out.println(i);
        }

        System.out.println("Rocket Launched!");

        // Closing scanner
        input.close();
    }
}
