import java.util.Scanner;

public class RocketLaunch {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        
        System.out.print("Enter countdown start value: ");
         int counter = input.nextInt();

        // Countdown using while loop
        while (counter >= 1) {
            System.out.println(counter);
            counter--; // decrementing counter
        }

        System.out.println("Rocket Launched!");

        // Closing scanner
        input.close();
    }
}
