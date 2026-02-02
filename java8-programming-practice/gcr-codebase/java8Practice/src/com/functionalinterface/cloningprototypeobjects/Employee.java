package com.functionalinterface.cloningprototypeobjects;
class Employee implements Cloneable {
    String name;

    Employee(String name) {
        this.name = name;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
