package com.encapsulationandpolymorphism.employeemanagementsystem;

public abstract class Employee {

    private int employeeId;
    private String name;
    protected double baseSalary;

    public Employee(int employeeId, String name, double baseSalary) {
        this.employeeId = employeeId;
        this.name = name;
        this.baseSalary = baseSalary;
    }

    // Encapsulation
    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    // Abstract method
    public abstract double calculateSalary();

    // Concrete method
    public void displayDetails() {
        System.out.println("ID     : " + employeeId);
        System.out.println("Name   : " + name);
        System.out.println("Salary : " + calculateSalary());
    }
}
