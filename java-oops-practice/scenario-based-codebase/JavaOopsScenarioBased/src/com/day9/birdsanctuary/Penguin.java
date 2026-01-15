package com.day9.birdsanctuary;
public class Penguin extends Bird implements Swimmable {

    public Penguin(String name, String id) {
        super(name, id, "Penguin");
    }

    @Override
    public void swim() {
        System.out.println(getName() + " is swimming");
    }
}
