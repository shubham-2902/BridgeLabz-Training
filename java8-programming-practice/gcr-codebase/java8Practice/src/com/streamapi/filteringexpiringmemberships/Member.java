package com.streamapi.filteringexpiringmemberships;
import java.time.LocalDate;

public class Member {
    private String name;
    private LocalDate expiryDate;

    public Member(String name, LocalDate expiryDate) {
        this.name = name;
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() { return expiryDate; }

    @Override
    public String toString() {
        return name + " Expiry: " + expiryDate;
    }
}
