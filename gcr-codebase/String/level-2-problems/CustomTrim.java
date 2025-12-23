import java.util.Scanner;
 
 public class CustomTrim {

    // Method to find start and end index after trimming spaces
    public static int[] findTrimIndexes(String text) {

        int start = 0;
        int end = text.length() - 1;

        // Remove leading spaces
        while (start <= end && text.charAt(start) == ' ') {
            start++;
        }

        // Remove trailing spaces
        while (end >= start && text.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String customSubstring(String text, int start, int end) {

        String result = "";

        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with leading and trailing spaces: ");
        String text = sc.nextLine();

        int[] indexes = findTrimIndexes(text);
        String customTrimmed = customSubstring(text, indexes[0], indexes[1]);
        String builtInTrimmed = text.trim();

        boolean result = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nCustom Trimmed String : [" + customTrimmed + "]");
        System.out.println("Built-in Trimmed String : [" + builtInTrimmed + "]");
        System.out.println("Comparison Result : " + result);
    }
}
