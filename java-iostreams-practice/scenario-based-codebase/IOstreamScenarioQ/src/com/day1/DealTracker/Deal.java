package com.day1.DealTracker;
import java.time.LocalDate;

public class Deal {
    String code;
    int discount;
    LocalDate validTill;
    int minPurchase;

    public Deal(String code, int discount, LocalDate validTill, int minPurchase) {
        this.code = code;
        this.discount = discount;
        this.validTill = validTill;
        this.minPurchase = minPurchase;
    }

    @Override
    public String toString() {
        return code + " - " + discount + "% (Valid till " + validTill + ")";
    }
}
