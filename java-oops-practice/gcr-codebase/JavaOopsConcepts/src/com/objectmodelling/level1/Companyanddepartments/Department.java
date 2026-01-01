package com.objectmodelling.level1.Companyanddepartments;

import java.util.ArrayList;
import java.util.List;

class Department {

    private String deptName;
    private List<Employee> employees = new ArrayList<>();

    Department(String deptName) {
        this.deptName = deptName;
    }

    void addEmployee(int id, String name) {
        employees.add(new Employee(id, name));
    }

    void displayDepartment() {
        System.out.println("  Department: " + deptName);
        for (Employee e : employees) {
            e.displayEmployee();
        }
    }
}
