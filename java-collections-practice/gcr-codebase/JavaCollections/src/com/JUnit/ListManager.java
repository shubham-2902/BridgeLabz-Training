package com.JUnit;
import java.util.List;

public class ListManager {

    public void addElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.add(element);
    }

    public void removeElement(List<Integer> list, int element) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        list.remove(Integer.valueOf(element));
    }

    public int getSize(List<Integer> list) {
        if (list == null) {
            throw new IllegalArgumentException("List cannot be null");
        }
        return list.size();
    }
}