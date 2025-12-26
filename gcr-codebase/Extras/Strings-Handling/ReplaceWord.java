import java.util.Scanner;

public class ReplaceWord {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = sc.nextLine();

        System.out.print("Enter word to replace: ");
        String oldWord = sc.next();

        System.out.print("Enter new word: ");
        String newWord = sc.next();

        String result = replaceWord(sentence, oldWord, newWord);
        System.out.println("Modified Sentence: " + result);

        sc.close();
    }
     // methods to replace the words
    public static String replaceWord(String sentence, String oldWord, String newWord) {

        String[] words = sentence.split(" ");
        String result = "";

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result += newWord;
            } else {
                result += words[i];
            }

            if (i < words.length - 1) {
                result += " ";
            }
        }
        return result;
    }
}
