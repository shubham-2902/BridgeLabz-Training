package com.day1.ChatLogParser;
public interface MessageFilter<T> {
    boolean allow(T message);
}
