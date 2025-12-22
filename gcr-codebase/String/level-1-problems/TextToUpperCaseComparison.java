import java.util.Scanner;

public class TextToUpperCaseComparison {

    // Convert text to UPPERCASE using charAt() and ASCII logic
    public static String toUpperCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // ASCII difference between 'a' and 'A' is 32
            if (ch >= 'a' && ch <= 'z') {
                result = result + (char) (ch - 32);
            } else {
                result = result + ch;
            }
        }
        return result;
    }

    // Compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String s1, String s2) {

        if (s1.length() != s2.length())
            return false;

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i))
                return false;
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take complete text input
        System.out.print("Enter complete text: ");
        String text = sc.nextLine();

        // User-defined conversion
        String userUpper = toUpperCaseUsingCharAt(text);

        // Built-in conversion
        String builtInUpper = text.toUpperCase();

        System.out.println("\nUser Uppercase     : " + userUpper);
        System.out.println("Built-in Uppercase : " + builtInUpper);

        // Compare results
        System.out.println("Comparison Result : " +
                compareStringsUsingCharAt(userUpper, builtInUpper));
    }
}
