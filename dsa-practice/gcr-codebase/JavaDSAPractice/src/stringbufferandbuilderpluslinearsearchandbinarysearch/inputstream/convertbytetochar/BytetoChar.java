package stringbufferandbuilderpluslinearsearchandbinarysearch.inputstream.convertbytetochar;
import java.io.*;

public class BytetoChar {
    public static void main(String[] args) throws Exception {

        String filePath = "Ramayana.txt";

        FileInputStream fis = new FileInputStream(filePath);
        InputStreamReader isr = new InputStreamReader(fis, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        String line;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();  // closes BufferedReader + InputStreamReader + FileInputStream automatically
    }
}
