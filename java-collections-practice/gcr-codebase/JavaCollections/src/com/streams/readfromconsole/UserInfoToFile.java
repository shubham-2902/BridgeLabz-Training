package com.streams.readfromconsole;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class UserInfoToFile {

    public static void main(String[] args) {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            // Taking input from user
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.print("Enter your age: ");
            int age = Integer.parseInt(br.readLine());

            System.out.print("Enter your favorite programming language: ");
            String language = br.readLine();

            // Writing data to file
            FileWriter fw = new FileWriter("userInfo.txt");

            fw.write("Name: " + name + "\n");
            fw.write("Age: " + age + "\n");
            fw.write("Favorite Language: " + language + "\n");

            fw.close();

            System.out.println("\nData saved successfully into userInfo.txt");

        } catch (IOException e) {
            System.out.println("File/Input error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Age must be a number!");
        }
    }
}
