package com.day2.texteditor;
import java.util.Scanner;

public class TextEditorApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        TextEditor editor = new TextEditor();

        while (true) {
            System.out.println("\n------ Text Editor ------");
            System.out.println("1. Insert Text");
            System.out.println("2. Delete Last N Characters");
            System.out.println("3. Undo");
            System.out.println("4. Redo");
            System.out.println("5. Show Text");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter text to insert: ");
                    String str = sc.nextLine();
                    editor.insert(str);
                    break;

                case 2:
                    System.out.print("Enter number of characters to delete: ");
                    int n = sc.nextInt();
                    sc.nextLine();
                    editor.delete(n);
                    break;

                case 3:
                    editor.undo();
                    break;

                case 4:
                    editor.redo();
                    break;

                case 5:
                    editor.showText();
                    break;

                case 6:
                    System.out.println("Program ended.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}
