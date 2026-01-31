package com.csvdatahandling.sortcsv;

import java.io.*;
import java.util.*;

class Employee {
    String id, name, dept;
    double salary;

    Employee(String id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }
}

public class SortBySalary {
    public static void main(String[] args) throws Exception {

        List<Employee> list = new ArrayList<>();

        InputStream is = SortBySalary.class
                .getClassLoader()
                .getResourceAsStream("employee.csv");

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        br.readLine(); // skip header

        String line;
        while ((line = br.readLine()) != null) {
            String[] d = line.split(",");
            list.add(new Employee(d[0], d[1], d[2], Double.parseDouble(d[3])));
        }

        br.close();

        list.sort((a, b) -> Double.compare(b.salary, a.salary));

        System.out.println("Top 5 Highest Paid Employees:");
        for (int i = 0; i < Math.min(5, list.size()); i++) {
            Employee e = list.get(i);
            System.out.println(e.name + " - " + e.salary);
        }
    }
}
