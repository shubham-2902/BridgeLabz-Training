package com.encapsulationandpolymorphism.librarymgmtsysytem;

public interface Reservable {

    void reserveItem(String borrowerName);
    boolean checkAvailability();
}

