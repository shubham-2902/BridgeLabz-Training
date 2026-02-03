package com.collectors.wordfreqcounter;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordMain {
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the Sentence");
        String text = sc.nextLine();
        Map<String, Long> frequency =
            Arrays.stream(text.split(" "))
                  .collect(Collectors.toMap(
                      Function.identity(),
                      w -> 1L,
                      Long::sum
                  ));

        frequency.forEach((word, count) ->
            System.out.println(word + " -> " + count));
    }
}
