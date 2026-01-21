package com.streams.saveandretrieve;
import java.io.*;
import java.util.ArrayList;

public class EmployeeSerializationDemo {

    public static void main(String[] args) {

        String fileName = "employees.dat";

        // 1) Create Employee List
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(101, "Amit", "IT", 55000));
        empList.add(new Employee(102, "Neha", "HR", 45000));
        empList.add(new Employee(103, "Rahul", "Finance", 60000));

        // 2) Serialize Employee List into file
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(fileName));
            oos.writeObject(empList);
            oos.close();
            System.out.println("Employees saved successfully into file!");

        } catch (IOException e) {
            System.out.println("Error while saving employees: " + e.getMessage());
        }

        // 3) Deserialize Employee List from file and display
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(fileName));

            ArrayList<Employee> savedList = (ArrayList<Employee>) ois.readObject();
            ois.close();

            System.out.println("\n--- Employees Read From File ---");
            for (Employee emp : savedList) {
                System.out.println(emp);
            }

        } catch (IOException e) {
            System.out.println("Error while reading employees: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found: " + e.getMessage());
        }
    }
}
