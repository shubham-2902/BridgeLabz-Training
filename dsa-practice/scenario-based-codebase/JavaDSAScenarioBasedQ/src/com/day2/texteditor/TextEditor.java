package com.day2.texteditor;
import java.util.Stack;

public class TextEditor {

    private StringBuilder text;
    private Stack<Action> undoStack;
    private Stack<Action> redoStack;

    public TextEditor() {
        text = new StringBuilder();
        undoStack = new Stack<>();
        redoStack = new Stack<>();
    }

    // Insert text at end
    public void insert(String str) {
        text.append(str);

        undoStack.push(new Action("INSERT", str));
        redoStack.clear(); // new action clears redo history

        System.out.println("Inserted successfully.");
    }

    // Delete last n characters
    public void delete(int n) {
        if (n <= 0) {
            System.out.println("Invalid delete length.");
            return;
        }

        if (text.length() == 0) {
            System.out.println("Nothing to delete.");
            return;
        }

        if (n > text.length()) n = text.length();

        String deleted = text.substring(text.length() - n);
        text.delete(text.length() - n, text.length());

        undoStack.push(new Action("DELETE", deleted));
        redoStack.clear();

        System.out.println("Deleted successfully.");
    }

    // Undo operation
    public void undo() {
        if (undoStack.isEmpty()) {
            System.out.println("Nothing to undo.");
            return;
        }

        Action lastAction = undoStack.pop();

        if (lastAction.type.equals("INSERT")) {
            // undo insert = remove inserted value
            int len = lastAction.value.length();
            text.delete(text.length() - len, text.length());
        } else if (lastAction.type.equals("DELETE")) {
            // undo delete = insert deleted value back
            text.append(lastAction.value);
        }

        redoStack.push(lastAction);
        System.out.println("Undo done.");
    }

    // Redo operation
    public void redo() {
        if (redoStack.isEmpty()) {
            System.out.println("Nothing to redo.");
            return;
        }

        Action action = redoStack.pop();

        if (action.type.equals("INSERT")) {
            text.append(action.value);
        } else if (action.type.equals("DELETE")) {
            int len = action.value.length();
            text.delete(text.length() - len, text.length());
        }

        undoStack.push(action);
        System.out.println("Redo done.");
    }

    // Display current text
    public void showText() {
        System.out.println("Current Text: " + text.toString());
    }
}
