import java.util.Scanner;

class StringLengthWithoutMethod {

    // Method to find string length without using length()
    public static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); // Will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Exception caught when index exceeds string length
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = sc.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without using length(): " + customLength);
        System.out.println("Length using built-in method: " + builtInLength);
    }
}
