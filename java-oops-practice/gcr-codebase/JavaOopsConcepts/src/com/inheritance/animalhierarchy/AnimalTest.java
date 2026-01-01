package com.inheritance.animalhierarchy;

//AnimalTest.java
public class AnimalTest {

 public static void main(String[] args) {

     Animal a1 = new Dog("Bruno", 3);
     Animal a2 = new Cat("Kitty", 2);
     Animal a3 = new Bird("Parrot", 1);

     a1.makeSound();
     a2.makeSound();
     a3.makeSound();
 }
}
