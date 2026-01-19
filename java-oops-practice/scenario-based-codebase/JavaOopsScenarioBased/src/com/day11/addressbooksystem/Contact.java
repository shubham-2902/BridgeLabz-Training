package com.day11.addressbooksystem;
public class Contact {
    private String firstName;
    private String lastName;
    private String phone;
    private String email;

    // Composition: contact has an address
    private Address address;

    public Contact(String firstName, String lastName, String phone, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    // Getters
    public String getFirstName() { return firstName; }
    public String getLastName() { return lastName; }
    public String getPhone() { return phone; }
    public String getEmail() { return email; }
    public Address getAddress() { return address; }

    // Setters
    public void setPhone(String phone) { this.phone = phone; }
    public void setEmail(String email) { this.email = email; }
    public void setAddress(Address address) { this.address = address; }

    // Used for sorting/displaying
    public String getFullName() {
        return firstName.trim() + " " + lastName.trim();
    }

    @Override
    public String toString() {
        return "Name: " + getFullName() +
               " | Phone: " + phone +
               " | Email: " + email +
               " | Address: " + (address == null ? "N/A" : address.toString());
    }
}
