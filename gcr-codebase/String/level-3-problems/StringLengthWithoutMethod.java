import java.util.Scanner;

public class StringLengthWithoutMethod {

    // Method to find length of string without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); // Access characters one by one
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception occurs when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }
}
