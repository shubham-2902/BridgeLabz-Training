import java.util.Scanner;

public class TextToLowerCaseComparison {

    // Convert text to lowercase using charAt() and ASCII logic
    public static String toLowerCaseUsingCharAt(String text) {
        String result = "";

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            // ASCII difference between 'A' and 'a' is 32
            if (ch >= 'A' && ch <= 'Z') {
                result = result + (char) (ch + 32);
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
        String userLower = toLowerCaseUsingCharAt(text);

        // Built-in conversion
        String builtInLower = text.toLowerCase();

        System.out.println("\nUser Lowercase     : " + userLower);
        System.out.println("Built-in Lowercase : " + builtInLower);

        // Compare results
        System.out.println("Comparison Result : " +
                compareStringsUsingCharAt(userLower, builtInLower));
    }
}
