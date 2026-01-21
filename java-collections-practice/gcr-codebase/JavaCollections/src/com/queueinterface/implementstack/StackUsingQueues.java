package com.queueinterface.implementstack;
import java.util.*;

class MyStack {
    private Queue<Integer> q1 = new LinkedList<>();
    private Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        // Move everything to q2
        while (!q1.isEmpty()) {
            q2.add(q1.remove());
        }

        // Add new element to q1
        q1.add(x);

        // Move back all elements to q1
        while (!q2.isEmpty()) {
            q1.add(q2.remove());
        }
    }

    public int pop() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.remove();
    }

    public int top() {
        if (q1.isEmpty()) throw new RuntimeException("Stack is empty");
        return q1.peek();
    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }
}

public class StackUsingQueues {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MyStack stack = new MyStack();

        while (true) {
            System.out.println("\n========= STACK USING QUEUES MENU =========");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Top");
            System.out.println("4. Is Empty?");
            System.out.println("0. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value to push: ");
                    int val = sc.nextInt();
                    stack.push(val);
                    System.out.println(val + " pushed.");
                    break;

                case 2:
                    try {
                        System.out.println("Popped: " + stack.pop());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Top: " + stack.top());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    System.out.println(stack.isEmpty() ? "Stack is empty" : "Stack is not empty");
                    break;

                case 0:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
