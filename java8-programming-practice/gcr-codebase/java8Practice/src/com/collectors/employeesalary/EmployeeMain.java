package com.collectors.employeesalary;
import java.util.*;
import java.util.stream.*;

public class EmployeeMain {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("IT", 50000),
            new Employee("HR", 30000),
            new Employee("IT", 70000),
            new Employee("HR", 40000)
        );

        Map<String, Double> avgSalaryByDept =
            employees.stream()
                     .collect(Collectors.groupingBy(
                         Employee::getDepartment,
                         Collectors.averagingDouble(Employee::getSalary)
                     ));

        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " Avg Salary: " + avg));
    }
}
