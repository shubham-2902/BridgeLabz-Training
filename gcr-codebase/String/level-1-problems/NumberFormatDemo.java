import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate exception
    public static void generateException(String text) {
        int number = Integer.parseInt(text); // Invalid number
        System.out.println(number);
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a value: ");
        String text = sc.next();

        // Uncomment to see abnormal termination
        // generateException(text);

        handleException(text);
    }
}
