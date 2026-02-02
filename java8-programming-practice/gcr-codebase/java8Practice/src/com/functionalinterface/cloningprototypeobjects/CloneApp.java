package com.functionalinterface.cloningprototypeobjects;
public class CloneApp {
    public static void main(String[] args) throws Exception {
        Employee e1 = new Employee("Amit");
        Employee e2 = (Employee) e1.clone();

        System.out.println("Original: " + e1.name);
        System.out.println("Clone: " + e2.name);
    }
}
