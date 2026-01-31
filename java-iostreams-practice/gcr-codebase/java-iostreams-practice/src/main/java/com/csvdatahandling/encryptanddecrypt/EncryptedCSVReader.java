package com.csvdatahandling.encryptanddecrypt;
import java.io.BufferedReader;
import java.io.FileReader;

public class EncryptedCSVReader {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new FileReader("employees.csv"));

        String line = br.readLine(); // skip header

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");

            String id = data[0];
            String name = data[1];
            String email = CryptoMechanism.decrypt(data[2]);
            String salary = CryptoMechanism.decrypt(data[3]);

            System.out.println("ID: " + id);
            System.out.println("Name: " + name);
            System.out.println("Email: " + email);
            System.out.println("Salary: " + salary);
            System.out.println("--------------------");
        }

        br.close();
    }
}
