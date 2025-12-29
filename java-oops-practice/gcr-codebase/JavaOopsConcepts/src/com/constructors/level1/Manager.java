package com.constructors.level1;

class Employee {

    private int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public double getSalary() {
        return salary;
    }

    public void updateSalary(double salary) {
        if (salary > 0) {
            this.salary = salary;
        }
    }
}

public class Manager extends Employee {

    Manager(int id, String dept, double salary) {
        super(id, dept, salary);
    }

    void displayManager() {
        System.out.println("Employee ID : " + getEmployeeID());
        System.out.println("Department  : " + department);
        System.out.println("Salary      : ₹" + getSalary());
    }

    public static void main(String[] args) {
        Manager mgr =
                new Manager(301, "IT", 80000);
        mgr.updateSalary(90000);
        mgr.displayManager();
    }
}
