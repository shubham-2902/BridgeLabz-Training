package com.csvdatahandling.encryptanddecrypt;
import java.io.FileWriter;
import java.io.PrintWriter;

public class EncryptedCSVWriter {

    public static void main(String[] args) throws Exception {

        PrintWriter writer = new PrintWriter(new FileWriter("employees.csv"));

        // Header
        writer.println("ID,Name,Email,Salary");

        String emailEnc = CryptoMechanism.encrypt("john@gmail.com");
        String salaryEnc = CryptoMechanism.encrypt("75000");

        writer.println("101,John," + emailEnc + "," + salaryEnc);

        writer.close();
        System.out.println("CSV written with encrypted data.");
    }
}
