import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateException(String text) {
        System.out.println(text.charAt(text.length())); // Invalid index
    }

    // Method to handle exception
    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.next();

        // Uncomment to see abnormal termination
        // generateException(text);

        handleException(text);
    }
}
