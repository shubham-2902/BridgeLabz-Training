package com.day1.ChatLogParser;
import java.util.*;

public class IdleChatFilter implements MessageFilter<String> {

    private static final List<String> idleWords =
            Arrays.asList("lol", "brb", "haha");

    @Override
    public boolean allow(String message) {
        for (String word : idleWords) {
            if (message.toLowerCase().contains(word))
                return false;
        }
        return true;
    }
}
