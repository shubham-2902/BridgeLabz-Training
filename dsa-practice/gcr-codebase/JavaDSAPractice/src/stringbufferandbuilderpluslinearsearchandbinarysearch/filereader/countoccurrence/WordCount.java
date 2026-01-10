package stringbufferandbuilderpluslinearsearchandbinarysearch.filereader.countoccurrence;
import java.io.*;
import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file = sc.nextLine();
        System.out.print("Enter word to search: ");
        String target = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;
        int count = 0;

        while ((line = br.readLine()) != null) {
            String[] words = line.split("\\s+");
            for (String w : words) {
                if (w.equals(target)) count++;
            }
        }

        br.close();
        System.out.println("Word Count: " + count);
    }
}
