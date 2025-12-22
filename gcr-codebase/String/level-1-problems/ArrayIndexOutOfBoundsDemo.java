import java.util.Scanner;

public class ArrayIndexOutOfBoundsDemo {

    // Method to generate exception
    public static void generateException(String[] names) {
        System.out.println(names[names.length]); // Invalid index
    }

    // Method to handle exception
    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException handled");
        } catch (RuntimeException e) {
            System.out.println("Generic RuntimeException handled");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        String[] names = new String[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = sc.next();
        }

        // Uncomment to see abnormal termination
        // generateException(names);

        handleException(names);
    }
}
