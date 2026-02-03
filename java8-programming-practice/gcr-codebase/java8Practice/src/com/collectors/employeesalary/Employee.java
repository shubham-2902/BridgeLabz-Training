package com.collectors.employeesalary;
public class Employee {
    private String department;
    private double salary;

    public Employee(String department, double salary) {
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() { return department; }
    public double getSalary() { return salary; }
}
