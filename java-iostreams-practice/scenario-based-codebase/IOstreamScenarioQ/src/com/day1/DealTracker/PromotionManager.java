package com.day1.DealTracker;
import java.util.*;

public class PromotionManager<T> {
    List<T> promotions = new ArrayList<>();

    public void add(T promo) {
        promotions.add(promo);
    }

    public List<T> getAll() {
        return promotions;
    }
}
