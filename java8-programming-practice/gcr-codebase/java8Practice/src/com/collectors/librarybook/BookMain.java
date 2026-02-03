package com.collectors.librarybook;
import java.util.*;
import java.util.stream.*;

public class BookMain {
    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
            new Book("Fiction", 300),
            new Book("Fiction", 450),
            new Book("Science", 500),
            new Book("Science", 350)
        );

        Map<String, IntSummaryStatistics> stats =
            books.stream()
                 .collect(Collectors.groupingBy(
                     Book::getGenre,
                     Collectors.summarizingInt(Book::getPages)
                 ));

        stats.forEach((genre, s) -> {
            System.out.println(genre +
                " -> Total: " + s.getSum() +
                ", Avg: " + s.getAverage() +
                ", Max: " + s.getMax());
        });
    }
}
