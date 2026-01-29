package com.annotations;
import java.util.ArrayList;

public class SuppressWarningExample {

   @SuppressWarnings("unchecked")
    public static void main(String[] args) {

        ArrayList list = new ArrayList(); // Raw type warnings
        list.add("Hello");
        list.add(100);

        System.out.println(list);
    }
}