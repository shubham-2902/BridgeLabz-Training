package com.streams.storeandretrieveprimitive;
import java.io.*;

public class StudentDataStream {

    public static void main(String[] args) {

        String fileName = "student";

        // Writing student data into binary file
        try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fileName))) {

            int rollNo = 101;
            String name = "Shubham";
            double gpa = 8.75;

            dos.writeInt(rollNo);
            dos.writeUTF(name);
            dos.writeDouble(gpa);

            System.out.println("Student details saved successfully!");

        } catch (IOException e) {
            System.out.println("Error while writing: " + e.getMessage());
        }

        //  Reading student data from binary file
        try (DataInputStream dis = new DataInputStream(new FileInputStream(fileName))) {

            int rollNo = dis.readInt();
            String name = dis.readUTF();
            double gpa = dis.readDouble();

            System.out.println("\n--- Student Details Retrieved ---");
            System.out.println("Roll No: " + rollNo);
            System.out.println("Name   : " + name);
            System.out.println("GPA    : " + gpa);

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }
}
