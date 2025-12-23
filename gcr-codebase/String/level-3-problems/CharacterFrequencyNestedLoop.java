import java.util.Scanner;

public class CharacterFrequencyNestedLoop {

    // Method to find frequency using nested loops
    public static String[] findFrequency(String text) {

        char[] chars = text.toCharArray();
        int[] freq = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '0') {
                continue;
            }

            freq[i] = 1;

            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    freq[i]++;
                    chars[j] = '0'; // Mark duplicate
                }
            }
        }

        // Count unique characters
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                count++;
            }
        }

        // Store result in 1D String array
        String[] result = new String[count * 2];
        int index = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '0') {
                result[index++] = String.valueOf(chars[i]);
                result[index++] = String.valueOf(freq[i]);
            }
        }

        return result;
    }

    // Method to display result
    public static void display(String[] data) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-----------------------");

        for (int i = 0; i < data.length; i += 2) {
            System.out.println(data[i] + "\t\t" + data[i + 1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[] frequencyData = findFrequency(text);
        display(frequencyData);
    }
}
