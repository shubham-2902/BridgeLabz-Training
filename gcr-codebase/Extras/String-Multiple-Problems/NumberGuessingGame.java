import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {

    static Scanner sc = new Scanner(System.in);

    // Method to get user feedback for the computer's guess
    static String getFeedback(int guess) {
        System.out.print("Is the number " + guess + "? (high/low/correct): ");
        return sc.next().toLowerCase();
    }

    public static void main(String[] args) {
        int low = 1, high = 100;
        Random rand = new Random();

        System.out.println("Think of a number between 1 and 100.");

        while (true) {
            int guess = rand.nextInt(high - low + 1) + low;
            String feedback = getFeedback(guess);

            if (feedback.equals("correct")) {
                System.out.println("Computer guessed the number!");
                break;
            } else if (feedback.equals("high")) {
                high = guess - 1;
            } else if (feedback.equals("low")) {
                low = guess + 1;
            }
        }
    }
}
