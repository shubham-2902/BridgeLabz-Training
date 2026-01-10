package stringbufferandbuilderpluslinearsearchandbinarysearch.inputstream.readandwrite;
import java.io.*;

public class ConsoleToFileUsingInputStreamReader {
    public static void main(String[] args) throws IOException {

        // 1) Read from console (System.in is byte stream)
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);

        // 2) Write to file
        FileWriter fw = new FileWriter("output.txt", true); // true => append mode
        BufferedWriter bw = new BufferedWriter(fw);

        System.out.println("Enter text (type 'exit' to stop):");

        String input;

        while (true) {
            input = br.readLine();

            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            bw.write(input);
            bw.newLine(); // write each input on a new line
        }

        bw.close(); // closes bw + fw automatically
        br.close(); // closes br + isr automatically

        System.out.println(" Input saved to output.txt");
    }
}
