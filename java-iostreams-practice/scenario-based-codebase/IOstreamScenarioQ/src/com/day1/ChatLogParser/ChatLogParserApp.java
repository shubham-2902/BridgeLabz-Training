package com.day1.ChatLogParser;
import java.io.*;
import java.util.*;
import java.util.regex.*;

public class ChatLogParserApp {

    public static void main(String[] args) {

        String regex = "\\[(.*?)\\] (.*?): (.*)";
        Pattern pattern = Pattern.compile(regex);

        Map<String, List<String>> userMessages = new TreeMap<>();
        MessageFilter<String> filter = new IdleChatFilter();

        try (BufferedReader br = new BufferedReader(new FileReader("chat.txt"))) {

            String line;

            while ((line = br.readLine()) != null) {
                Matcher m = pattern.matcher(line);

                if (m.find()) {
                    String timestamp = m.group(1);
                    String user = m.group(2);
                    String message = m.group(3);

                    if (!filter.allow(message)) continue;

                    userMessages
                        .computeIfAbsent(user, k -> new ArrayList<>())
                        .add("[" + timestamp + "] " + message);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("\n--- Parsed Chat Messages ---");
        userMessages.forEach((user, msgs) -> {
            System.out.println(user + " -> ");
            msgs.forEach(System.out::println);
            System.out.println();
        });
    }
}
