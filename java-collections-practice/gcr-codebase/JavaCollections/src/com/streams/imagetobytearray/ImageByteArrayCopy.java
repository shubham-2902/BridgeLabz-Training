package com.streams.imagetobytearray;
import java.io.*;

public class ImageByteArrayCopy {

    public static void main(String[] args) {

        String originalImage = "Sample.jpg";
        String newImage = "copied.jpg";

        try {
            // Step 1: Convert image file to byte array
            byte[] imageBytes = imageToByteArray(originalImage);

            // Step 2: Write byte array back to new image file
            byteArrayToImage(imageBytes, newImage);

            System.out.println("Image copied successfully!");

            // Step 3: Verify if both images are identical
            boolean isSame = compareFiles(originalImage, newImage);

            if (isSame) {
                System.out.println("Verification Passed: Both images are identical ✅");
            } else {
                System.out.println("Verification Failed: Images are different ❌");
            }

        } catch (IOException e) {
            System.out.println("I/O Error: " + e.getMessage());
        }
    }

    // Converts Image file to byte array (using ByteArrayOutputStream)
    static byte[] imageToByteArray(String filePath) throws IOException {

        FileInputStream fis = new FileInputStream(filePath);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = fis.read(buffer)) != -1) {
            baos.write(buffer, 0, bytesRead);
        }

        fis.close();

        return baos.toByteArray();
    }

    // Writes byte array back into Image file (using ByteArrayInputStream)
    static void byteArrayToImage(byte[] data, String newFilePath) throws IOException {

        ByteArrayInputStream bais = new ByteArrayInputStream(data);
        FileOutputStream fos = new FileOutputStream(newFilePath);

        byte[] buffer = new byte[4096];
        int bytesRead;

        while ((bytesRead = bais.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }

        fos.close();
    }

    // Compare both files byte-by-byte
    static boolean compareFiles(String file1, String file2) throws IOException {

        FileInputStream fis1 = new FileInputStream(file1);
        FileInputStream fis2 = new FileInputStream(file2);

        int b1, b2;

        while ((b1 = fis1.read()) != -1) {
            b2 = fis2.read();

            if (b1 != b2) {
                fis1.close();
                fis2.close();
                return false;
            }
        }

        // If file2 still has extra bytes, then also not same
        if (fis2.read() != -1) {
            fis1.close();
            fis2.close();
            return false;
        }

        fis1.close();
        fis2.close();
        return true;
    }
}
