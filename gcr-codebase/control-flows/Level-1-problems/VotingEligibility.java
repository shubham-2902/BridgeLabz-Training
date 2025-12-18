import java.util.Scanner;

public class VotingEligibility {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring variable
        int age;

        // Taking user input
        System.out.print("Enter age: ");
        age = input.nextInt();

        // Checking voting eligibility
        if (age >= 18) {
            System.out.println(
                    "The person's age is " + age + " and can vote."
            );
        } else {
            System.out.println(
                    "The person's age is " + age + " and cannot vote."
            );
        }

        // Closing scanner
        input.close();
    }
}
