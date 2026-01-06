package com.day4.petpal;
import java.util.Scanner;

public class PetPalMain {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== Adopt a Pet ===");
        System.out.println("1. Dog");
        System.out.println("2. Cat");
        System.out.println("3. Bird");
        System.out.println("Choose Pet Type:[Please choose only serial number] ");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Pet Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Pet Age: ");
        int age = sc.nextInt();

        Pet pet;
        if (choice == 1) pet = new Dog(name, age);
        else if (choice == 2) pet = new Cat(name, age);
        else pet = new Bird(name, age);

        pet.makeSound();

        System.out.println("\nChoose Interaction:[Only select serial number]");
        System.out.println("1. Feed");
        System.out.println("2. Play");
        System.out.println("3. Sleep");
        int action = sc.nextInt();

        if (action == 1) pet.feed();
        else if (action == 2) pet.play();
        else pet.sleep();

        System.out.println("\n--- Pet Status ---");
        pet.showStatus();

        sc.close();
    }
}
