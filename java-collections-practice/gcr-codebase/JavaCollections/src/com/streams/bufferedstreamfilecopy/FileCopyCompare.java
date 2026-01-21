package com.streams.bufferedstreamfilecopy;
import java.io.*;

public class FileCopyCompare {
    static final int SIZE = 4096; // 4KB

    public static void main(String[] args) throws Exception {

        String src = "Hello";          
        String dest1 = "unbufferedCopy";
        String dest2 = "bufferedCopy";

        long t1 = unbufferedCopy(src, dest1);
        long t2 = bufferedCopy(src, dest2);

        System.out.println("\n--- Time Comparison ---");
        System.out.println("Unbuffered : " + (t1 / 1_000_000) + " ms");
        System.out.println("Buffered   : " + (t2 / 1_000_000) + " ms");
    }

    // Normal (Unbuffered) Copy
    static long unbufferedCopy(String src, String dest) throws Exception {
        long start = System.nanoTime();

        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(dest);

        byte[] buffer = new byte[SIZE];
        int bytes;

        while ((bytes = fis.read(buffer)) != -1) {
            fos.write(buffer, 0, bytes);
        }

        fis.close();
        fos.close();

        long end = System.nanoTime();
        System.out.println("Unbuffered copy done!");
        return end - start;
    }

    // Buffered Copy
    static long bufferedCopy(String src, String dest) throws Exception {
        long start = System.nanoTime();

        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(dest));

        byte[] buffer = new byte[SIZE];
        int bytes;

        while ((bytes = bis.read(buffer)) != -1) {
            bos.write(buffer, 0, bytes);
        }

        bis.close();
        bos.close();

        long end = System.nanoTime();
        System.out.println("Buffered copy done!");
        return end - start;
    }
}
