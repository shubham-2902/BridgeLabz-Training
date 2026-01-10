package stringbufferandbuilderpluslinearsearchandbinarysearch.filereader.readfile;
import java.io.*;
import java.util.Scanner;
public class ReadFile {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file name: ");
        String file = sc.nextLine();

        BufferedReader br = new BufferedReader(new FileReader(file));
        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
