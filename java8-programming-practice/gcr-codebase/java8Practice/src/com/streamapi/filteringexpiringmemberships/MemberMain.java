package com.streamapi.filteringexpiringmemberships;
import java.time.LocalDate;
import java.util.*;

public class MemberMain {
    public static void main(String[] args) {
        List<Member> members = Arrays.asList(
            new Member("Amit", LocalDate.now().plusDays(10)),
            new Member("Riya", LocalDate.now().plusDays(40)),
            new Member("Karan", LocalDate.now().plusDays(25))
        );

        LocalDate today = LocalDate.now();
        LocalDate next30Days = today.plusDays(30);

        members.stream()
               .filter(m -> !m.getExpiryDate().isAfter(next30Days))
               .forEach(System.out::println);
    }
}
