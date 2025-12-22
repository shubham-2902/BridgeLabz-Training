import java.util.Scanner;
import java.util.Arrays;

public class StringtoCharArray {

    // User-defined method using charAt()
    public static char[] strToCharArrayUsingFor(String str) {
        char[] arr = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
        }
        return arr;
    }

    // Using built-in toCharArray()
    public static char[] strToCharArrayUsingBuiltIn(String str) {
        return str.toCharArray();
    }

    // Method to compare two char arrays
    public static boolean compareCharArrays(char[] a, char[] b) {
        if (a.length != b.length)
            return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i])
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String: ");
        String st = sc.next();

        char[] arr1 = strToCharArrayUsingFor(st);
        char[] arr2 = strToCharArrayUsingBuiltIn(st);

        System.out.println("CharArray using for(): " + Arrays.toString(arr1));
        System.out.println("CharArray using toCharArray(): " + Arrays.toString(arr2));

        System.out.println("Comparison Result: " + compareCharArrays(arr1, arr2));
    }
}
