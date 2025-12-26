import java.util.Scanner;

public class RemoveCharacter {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.print("Enter character to remove: ");
        char removeChar = sc.next().charAt(0);

        String result = removeCharacter(str, removeChar);
        System.out.println("Modified String: \"" + result + "\"");

        sc.close();
    }
    // methods to remove character
    public static String removeCharacter(String str, char ch) {
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ch) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
