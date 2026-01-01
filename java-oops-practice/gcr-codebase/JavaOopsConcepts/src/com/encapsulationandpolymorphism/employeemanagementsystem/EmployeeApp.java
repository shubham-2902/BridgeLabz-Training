package com.encapsulationandpolymorphism.employeemanagementsystem;

import java.util.ArrayList;
import java.util.List;

public class EmployeeApp {

    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<>();

        Employee emp1 = new FullTimeEmployee(101, "Amit", 50000);
        Employee emp2 = new PartTimeEmployee(102, "Riya", 500, 40);

        ((Department) emp1).assignDepartment("IT");
        ((Department) emp2).assignDepartment("HR");

        employees.add(emp1);
        employees.add(emp2);

        for (Employee emp : employees) {
            emp.displayDetails();              // Polymorphism
            ((Department) emp).getDepartmentDetails();
            System.out.println("-----------------------");
        }
    }
}
