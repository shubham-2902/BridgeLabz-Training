package com.encapsulationandpolymorphism.employeemanagementsystem;

public class PartTimeEmployee extends Employee implements Department {

    private int workHours;
    private String department;

    public PartTimeEmployee(int id, String name, double hourlyRate, int workHours) {
        super(id, name, hourlyRate);
        this.workHours = workHours;
    }

    @Override
    public double calculateSalary() {
        return baseSalary * workHours;
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
