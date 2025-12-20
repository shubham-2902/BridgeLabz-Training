import java.util.Scanner;
// Methods to find the chcocolate each student gets and remaining chocolate left
public class ChocolateDistribution {

    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        int eachChildGets = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{eachChildGets, remainingChocolates};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter number of children: ");
        int children = sc.nextInt();
        // result array to st0re the result
        int[] result = findRemainderAndQuotient(chocolates, children);

        System.out.println("Each child gets " + result[0] + " chocolates");
        System.out.println("Remaining chocolates " + result[1]);

        sc.close();
    }
}
