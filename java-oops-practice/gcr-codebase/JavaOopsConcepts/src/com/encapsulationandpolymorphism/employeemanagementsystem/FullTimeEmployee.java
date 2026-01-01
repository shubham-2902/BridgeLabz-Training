package com.encapsulationandpolymorphism.employeemanagementsystem;

public class FullTimeEmployee extends Employee implements Department {

    private String department;

    public FullTimeEmployee(int id, String name, double baseSalary) {
        super(id, name, baseSalary);
    }

    @Override
    public double calculateSalary() {
        return baseSalary; // Fixed monthly salary
    }

    @Override
    public void assignDepartment(String departmentName) {
        this.department = departmentName;
    }

    @Override
    public void getDepartmentDetails() {
        System.out.println("Department : " + department);
    }
}
