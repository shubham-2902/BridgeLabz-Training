import java.util.Scanner;

class ShortestLongestWord {

    // Method to find length without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            // handled
        }
        return count;
    }

    // Method to split text into words using charAt()
    public static String[] customSplit(String text) {

        int length = findLength(text);
        int wordCount = 1;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int index = 0;
        String word = "";

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[index++] = word;
                word = "";
            }
        }
        words[index] = word;

        return words;
    }

    // Method to create 2D array of word and length
    public static String[][] wordWithLength(String[] words) {

        String[][] data = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            data[i][0] = words[i];
            data[i][1] = String.valueOf(findLength(words[i]));
        }
        return data;
    }

    // Method to find shortest and longest word
    public static int[] findShortestAndLongest(String[][] data) {

        int minIndex = 0;
        int maxIndex = 0;

        for (int i = 1; i < data.length; i++) {
            int currentLength = Integer.parseInt(data[i][1]);
            int minLength = Integer.parseInt(data[minIndex][1]);
            int maxLength = Integer.parseInt(data[maxIndex][1]);

            if (currentLength < minLength) {
                minIndex = i;
            }
            if (currentLength > maxLength) {
                maxIndex = i;
            }
        }
        return new int[]{minIndex, maxIndex};
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        String[] words = customSplit(text);
        String[][] data = wordWithLength(words);
        int[] result = findShortestAndLongest(data);

        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i][0] + "\t" + data[i][1]);
        }

        System.out.println("\nShortest Word : " + data[result[0]][0]);
        System.out.println("Longest Word  : " + data[result[1]][0]);
    }
}
