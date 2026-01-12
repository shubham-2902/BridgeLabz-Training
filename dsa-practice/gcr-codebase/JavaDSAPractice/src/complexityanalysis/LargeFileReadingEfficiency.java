

package complexityanalysis;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class LargeFileReadingEfficiency{

    //read file using FileReader
    public static void readUsingFileReader(String filePath){
        long start=System.nanoTime();
        int wordCount=0;

        try(FileReader fr=new FileReader(filePath);
            BufferedReader br=new BufferedReader(fr)){

            String line;
            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");
                wordCount+=words.length;
            }

        }catch(IOException e){
            System.out.println("FileReader Error: "+e.getMessage());
        }

        long end=System.nanoTime();
        System.out.println("FileReader Time : "+(end-start)+" ns");
        System.out.println("Word Count      : "+wordCount);
    }

    //read file using InputStreamReader
    public static void readUsingInputStreamReader(String filePath){
        long start=System.nanoTime();
        int wordCount=0;

        try(FileInputStream fis=new FileInputStream(filePath);
            InputStreamReader isr=
                    new InputStreamReader(fis,StandardCharsets.UTF_8);
            BufferedReader br=new BufferedReader(isr)){

            String line;
            while((line=br.readLine())!=null){
                String[] words=line.split("\\s+");
                wordCount+=words.length;
            }

        }catch(IOException e){
            System.out.println("InputStreamReader Error: "+e.getMessage());
        }

        long end=System.nanoTime();
        System.out.println("InputStreamReader Time: "+(end-start)+" ns");
        System.out.println("Word Count            : "+wordCount);
    }

    //main method
    public static void main(String[] args){

        String filePath="largefile.txt"; //use a large file (e.g., 500MB)

        System.out.println("\n--- Reading Using FileReader ---");
        readUsingFileReader(filePath);

        System.out.println("\n--- Reading Using InputStreamReader ---");
        readUsingInputStreamReader(filePath);
    }
}