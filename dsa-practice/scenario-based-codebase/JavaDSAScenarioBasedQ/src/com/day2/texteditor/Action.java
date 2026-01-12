package com.day2.texteditor;
public class Action {
    String type;      // "INSERT" or "DELETE"
    String value;     // inserted or deleted text

    public Action(String type, String value) {
        this.type = type;
        this.value = value;
    }
}
