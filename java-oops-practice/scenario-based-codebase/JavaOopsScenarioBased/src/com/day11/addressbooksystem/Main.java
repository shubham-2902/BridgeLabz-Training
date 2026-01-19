package com.day11.addressbooksystem;
import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        AddressBook book = new AddressBook();

        while (true) {
            System.out.println("\nDigiContact Address Book");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Search by City");
            System.out.println("5. Search by State");
            System.out.println("6. Display All Contacts (Sorted)");
            System.out.println("7. Exit");
            System.out.print("Enter choice: ");

            int choice = readInt();

            switch (choice) {
                case 1:
                    addContact(book);
                    break;
                case 2:
                    editContact(book);
                    break;
                case 3:
                    deleteContact(book);
                    break;
                case 4:
                    System.out.print("Enter city: ");
                    book.searchByCity(sc.nextLine());
                    break;
                case 5:
                    System.out.print("Enter state: ");
                    book.searchByState(sc.nextLine());
                    break;
                case 6:
                    book.displayAllSorted();
                    break;
                case 7:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice.");
            }
        }
    }

    private static void addContact(AddressBook book) {
        System.out.print("First Name: ");
        String first = sc.nextLine();

        System.out.print("Last Name: ");
        String last = sc.nextLine();

        System.out.print("Phone: ");
        String phone = sc.nextLine();

        System.out.print("Email: ");
        String email = sc.nextLine();

        System.out.print("City (optional): ");
        String city = sc.nextLine();

        System.out.print("State (optional): ");
        String state = sc.nextLine();

        System.out.print("Zip (optional): ");
        String zip = sc.nextLine();

        Address address = null;
        if (!city.isBlank() || !state.isBlank() || !zip.isBlank()) {
            address = new Address(city, state, zip);
        }

        Contact contact = new Contact(first, last, phone, email, address);
        book.addContact(contact);
    }

    private static void editContact(AddressBook book) {
        System.out.print("Enter First Name of contact to edit: ");
        String first = sc.nextLine();

        System.out.print("Enter Last Name of contact to edit: ");
        String last = sc.nextLine();

        System.out.print("New Phone: ");
        String phone = sc.nextLine();

        System.out.print("New Email: ");
        String email = sc.nextLine();

        System.out.print("New City (optional): ");
        String city = sc.nextLine();

        System.out.print("New State (optional): ");
        String state = sc.nextLine();

        System.out.print("New Zip (optional): ");
        String zip = sc.nextLine();

        Address newAddress = null;
        if (!city.isBlank() || !state.isBlank() || !zip.isBlank()) {
            newAddress = new Address(city, state, zip);
        }

        book.editContact(first, last, phone, email, newAddress);
    }

    private static void deleteContact(AddressBook book) {
        System.out.print("Enter First Name of contact to delete: ");
        String first = sc.nextLine();

        System.out.print("Enter Last Name of contact to delete: ");
        String last = sc.nextLine();

        book.deleteContact(first, last);
    }

    private static int readInt() {
        while (true) {
            try {
                return Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Enter a valid number: ");
            }
        }
    }
}
