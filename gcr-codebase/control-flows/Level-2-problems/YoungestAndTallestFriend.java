import java.util.Scanner;
public class YoungestAndTallestFriend {

    public static void main(String[] args) {

        // Creating Scanner object
        Scanner input = new Scanner(System.in);

        // Declaring age variables
        int amarAge, akbarAge, anthonyAge;

        // Declaring height variables
        double amarHeight, akbarHeight, anthonyHeight;

        // Taking age inputs
        System.out.print("Enter Amar's age: ");
        amarAge = input.nextInt();

        System.out.print("Enter Akbar's age: ");
        akbarAge = input.nextInt();

        System.out.print("Enter Anthony's age: ");
        anthonyAge = input.nextInt();

        // Taking height inputs
        System.out.print("Enter Amar's height: ");
        amarHeight = input.nextDouble();

        System.out.print("Enter Akbar's height: ");
        akbarHeight = input.nextDouble();

        System.out.print("Enter Anthony's height: ");
        anthonyHeight = input.nextDouble();

        // Finding youngest
        if (amarAge <= akbarAge && amarAge <= anthonyAge) {
            System.out.println("Amar is the youngest.");
        } else if (akbarAge <= amarAge && akbarAge <= anthonyAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Finding tallest
        if (amarHeight >= akbarHeight && amarHeight >= anthonyHeight) {
            System.out.println("Amar is the tallest.");
        } else if (akbarHeight >= amarHeight && akbarHeight >= anthonyHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        input.close();
    }
}
