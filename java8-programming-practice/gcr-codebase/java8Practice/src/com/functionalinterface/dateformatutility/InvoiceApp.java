package com.functionalinterface.dateformatutility;
import java.time.LocalDate;

public class InvoiceApp {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();

        System.out.println(DateUtils.formatDate(today, "dd-MM-yyyy"));
        System.out.println(DateUtils.formatDate(today, "MMMM dd, yyyy"));
    }
}
