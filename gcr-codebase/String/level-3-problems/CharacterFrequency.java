import java.util.Scanner;

public class CharacterFrequency {

    // Method to find character frequency
    public static String[][] getCharacterFrequency(String text) {

        int[] freq = new int[256];

        // Step 1: Count frequency
        for (int i = 0; i < text.length(); i++) {
            freq[text.charAt(i)]++;
        }

        // Step 2: Count unique characters
        int uniqueCount = 0;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] > 0) {
                uniqueCount++;
                freq[text.charAt(i)] = -freq[text.charAt(i)];
            }
        }

        // Step 3: Create result array
        String[][] result = new String[uniqueCount][2];
        int index = 0;

        // Step 4: Store characters and frequencies
        for (int i = 0; i < text.length(); i++) {
            int ch = text.charAt(i);
            if (freq[ch] < 0) {
                result[index][0] = String.valueOf((char) ch);
                result[index][1] = String.valueOf(-freq[ch]);
                freq[ch] = 0;
                index++;
            }
        }

        return result;
    }

    // Method to display result
    public static void display(String[][] data) {
        System.out.println("\nCharacter\tFrequency");
        System.out.println("-----------------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t\t" + data[i][1]);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String[][] frequencyData = getCharacterFrequency(text);
        display(frequencyData);
    }
}
