package com.day11.addressbooksystem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AddressBook {
    private ArrayList<Contact> contacts;

    public AddressBook() {
        contacts = new ArrayList<>();
    }

    // Add contact with duplicate validation
    public void addContact(Contact newContact) {
        if (isDuplicate(newContact)) {
            System.out.println("Duplicate contact found. Contact not added.");
            return;
        }

        contacts.add(newContact);
        System.out.println("Contact added successfully.");
    }

    private boolean isDuplicate(Contact newContact) {
        for (Contact c : contacts) {
            boolean sameName = c.getFirstName().equalsIgnoreCase(newContact.getFirstName())
                    && c.getLastName().equalsIgnoreCase(newContact.getLastName());

            boolean samePhone = c.getPhone().equals(newContact.getPhone());
            boolean sameEmail = c.getEmail().equalsIgnoreCase(newContact.getEmail());

            // Duplicate rule: same name OR same phone OR same email
            if (sameName || samePhone || sameEmail) {
                return true;
            }
        }
        return false;
    }

    // Edit by name
    public void editContact(String firstName, String lastName, String newPhone, String newEmail, Address newAddress) {
        Contact contact = findByName(firstName, lastName);

        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }

        contact.setPhone(newPhone);
        contact.setEmail(newEmail);
        contact.setAddress(newAddress);

        System.out.println("Contact updated successfully.");
    }

    // Delete by name
    public void deleteContact(String firstName, String lastName) {
        Contact contact = findByName(firstName, lastName);

        if (contact == null) {
            System.out.println("Contact not found.");
            return;
        }

        contacts.remove(contact);
        System.out.println("Contact deleted successfully.");
    }

    // Search by city
    public void searchByCity(String city) {
        boolean found = false;
        System.out.println("\n--- Contacts in City: " + city + " ---");

        for (Contact c : contacts) {
            Address addr = c.getAddress();
            if (addr != null && addr.getCity().equalsIgnoreCase(city)) {
                System.out.println(c);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contacts found in this city.");
        }
    }

    // Search by state
    public void searchByState(String state) {
        boolean found = false;
        System.out.println("\n--- Contacts in State: " + state + " ---");

        for (Contact c : contacts) {
            Address addr = c.getAddress();
            if (addr != null && addr.getState().equalsIgnoreCase(state)) {
                System.out.println(c);
                found = true;
            }
        }

        if (!found) {
            System.out.println("No contacts found in this state.");
        }
    }

    // Display sorted alphabetically
    public void displayAllSorted() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
            return;
        }

        // Sorting by firstName then lastName
        Collections.sort(contacts, new Comparator<Contact>() {
            @Override
            public int compare(Contact c1, Contact c2) {
                int firstCompare = c1.getFirstName().compareToIgnoreCase(c2.getFirstName());
                if (firstCompare != 0) return firstCompare;
                return c1.getLastName().compareToIgnoreCase(c2.getLastName());
            }
        });

        System.out.println("\n--- All Contacts (Sorted) ---");
        for (Contact c : contacts) {
            System.out.println(c);
        }
    }

    // Helper: find contact by first+last name
    private Contact findByName(String firstName, String lastName) {
        for (Contact c : contacts) {
            if (c.getFirstName().equalsIgnoreCase(firstName)
                    && c.getLastName().equalsIgnoreCase(lastName)) {
                return c;
            }
        }
        return null;
    }
}
