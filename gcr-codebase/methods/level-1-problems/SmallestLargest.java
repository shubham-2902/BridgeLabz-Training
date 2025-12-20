import java.util.Scanner;

public class SmallestLargest {

    // Single method to find smallest and largest
    public static void findSmallestLargest(int a, int b, int c) {

        int smallest = a;
        int largest = a;

        if (b < smallest)
            smallest = b;
        if (c < smallest)
            smallest = c;

        if (b > largest)
            largest = b;
        if (c > largest)
            largest = c;

        System.out.println("Smallest number is: " + smallest);
        System.out.println("Largest number is: " + largest);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int n1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int n2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int n3 = sc.nextInt();
         // Calling the functions
        findSmallestLargest(n1, n2, n3);

        sc.close();
    }
}
