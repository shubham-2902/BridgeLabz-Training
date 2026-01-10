package stringbufferandbuilderpluslinearsearchandbinarysearch.challengeproblem.comparetime;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class ComparePerformance {

    public static void main(String[] args) throws Exception {

       
        // Part 1: StringBuilder vs StringBuffer
        
        System.out.println("===== StringBuilder vs StringBuffer =====");

        int times = 1_000_000;
        String text = "hello";

        long startBuilder = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < times; i++) {
            sb.append(text);
        }
        long endBuilder = System.nanoTime();

        long startBuffer = System.nanoTime();
        StringBuffer sf = new StringBuffer();
        for (int i = 0; i < times; i++) {
            sf.append(text);
        }
        long endBuffer = System.nanoTime();

        System.out.println("StringBuilder time: " + ((endBuilder - startBuilder) / 1_000_000) + " ms");
        System.out.println("StringBuffer  time: " + ((endBuffer - startBuffer) / 1_000_000) + " ms");

        // -----------------------------
        // Part 2: FileReader vs InputStreamReader
        // -----------------------------
        System.out.println("\n===== FileReader vs InputStreamReader =====");

        
        String filePath = "Ramayana.txt";

        long startFileReader = System.nanoTime();
        long wordsByFileReader = countWordsUsingFileReader(filePath);
        long endFileReader = System.nanoTime();

        long startISR = System.nanoTime();
        long wordsByISR = countWordsUsingInputStreamReader(filePath);
        long endISR = System.nanoTime();

        System.out.println("Word count (FileReader): " + wordsByFileReader);
        System.out.println("Time taken (FileReader): " + ((endFileReader - startFileReader) / 1_000_000) + " ms");

        System.out.println();

        System.out.println("Word count (InputStreamReader): " + wordsByISR);
        System.out.println("Time taken (InputStreamReader): " + ((endISR - startISR) / 1_000_000) + " ms");
    }

    // -----------------------------
    // Word Count using FileReader
    // -----------------------------
    private static long countWordsUsingFileReader(String filePath) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        long wordCount = 0;
        String line;

        while ((line = br.readLine()) != null) {
            wordCount += countWordsInLine(line);
        }

        br.close();
        return wordCount;
    }

    // -----------------------------
    // Word Count using InputStreamReader (UTF-8)
    // -----------------------------
    private static long countWordsUsingInputStreamReader(String filePath) throws Exception {
        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
        BufferedReader br = new BufferedReader(isr);

        long wordCount = 0;
        String line;

        while ((line = br.readLine()) != null) {
            wordCount += countWordsInLine(line);
        }

        br.close();
        return wordCount;
    }

    // Efficient word counter (no split to avoid huge memory usage)
    private static int countWordsInLine(String line) {
        int count = 0;
        boolean inWord = false;

        for (int i = 0; i < line.length(); i++) {
            char ch = line.charAt(i);

            if (Character.isWhitespace(ch)) {
                inWord = false;
            } else if (!inWord) {
                count++;
                inWord = true;
            }
        }

        return count;
    }
}
