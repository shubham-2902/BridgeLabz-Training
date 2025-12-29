import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int secretNumber = (int)(Math.random() * 100) + 1;

        int guess;
        int attempts = 0;

        do {
            System.out.print("Guess the number (1 to 100): ");
            guess = sc.nextInt();
            attempts++;

            if (guess > secretNumber) {
                System.out.println("Too high");
            } 
            else if (guess < secretNumber) {
                System.out.println("Too low");
            } 
            else {
                System.out.println("Correct! You guessed the number in "
                                   + attempts + " attempts.");
                break;   // exit loop on success
            }

            System.out.println("Attempts left: " + (5 - attempts));
            System.out.println("---------------------------");

        } while (attempts < 5);

            if (attempts == 5 && guess != secretNumber) {
            System.out.println("Game Over! Maximum attempts reached.");
            System.out.println("The correct number was: " + secretNumber);
        }

        sc.close();
    }
}
