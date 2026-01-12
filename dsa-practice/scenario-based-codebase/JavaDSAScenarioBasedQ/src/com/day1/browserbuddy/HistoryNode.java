package com.day1.browserbuddy;
public class HistoryNode {
    String url;
    HistoryNode prev;
    HistoryNode next;

    public HistoryNode(String url) {
        this.url = url;
        this.prev = null;
        this.next = null;
    }
}
