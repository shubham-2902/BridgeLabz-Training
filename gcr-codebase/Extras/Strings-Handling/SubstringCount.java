import java.util.Scanner;

public class SubstringCount {

    // methods for counting occurences
    public static int countOccurrences(String str, String sub) {
        int count = 0;

        for (int i = 0; i <= str.length() - sub.length(); i++) {
            if (str.substring(i, i + sub.length()).equals(sub))
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter main string: ");
        String mainStr = sc.nextLine();

        System.out.print("Enter substring: ");
        String subStr = sc.nextLine();

        System.out.println("Occurrences: " + countOccurrences(mainStr, subStr));
    }
}
