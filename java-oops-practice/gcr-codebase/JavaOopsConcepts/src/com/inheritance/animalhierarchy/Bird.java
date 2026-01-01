package com.inheritance.animalhierarchy;

//Bird.java
public class Bird extends Animal {

 public Bird(String name, int age) {
     super(name, age);
 }

 @Override
 public void makeSound() {
     System.out.println("Bird chirps: Tweet Tweet!");
 }
}
