package com.day2.traincompanion;
public class TrainCompartment {

    // Node class
    static class Node {
        String name;
        Node prev, next;

        Node(String name) {
            this.name = name;
        }
    }

    private Node head, tail, current;

    // Add compartment at end
    public void addLast(String name) {
        Node newNode = new Node(name);

        if (head == null) {
            head = tail = current = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Move forward
    public void next() {
        if (current == null) {
            System.out.println("Train is empty.");
            return;
        }

        if (current.next == null) {
            System.out.println("Already at last compartment.");
            return;
        }

        current = current.next;
        System.out.println("Current: " + current.name);
    }

    // Move backward
    public void prev() {
        if (current == null) {
            System.out.println("Train is empty.");
            return;
        }

        if (current.prev == null) {
            System.out.println("Already at first compartment.");
            return;
        }

        current = current.prev;
        System.out.println("Current: " + current.name);
    }

    // Show adjacent compartments
    public void showAdjacent() {
        if (current == null) {
            System.out.println("Train is empty.");
            return;
        }

        System.out.println("Previous: " + (current.prev != null ? current.prev.name : "None"));
        System.out.println("Current : " + current.name);
        System.out.println("Next    : " + (current.next != null ? current.next.name : "None"));
    }

    // Insert new compartment after given compartment
    public void insertAfter(String after, String newCompartment) {
        if (head == null) {
            System.out.println("Train is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(after)) {
                Node newNode = new Node(newCompartment);

                newNode.next = temp.next;
                newNode.prev = temp;

                if (temp.next != null) {
                    temp.next.prev = newNode;
                } else {
                    tail = newNode;
                }

                temp.next = newNode;
                System.out.println("Inserted " + newCompartment + " after " + after);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Compartment not found: " + after);
    }

    // Remove compartment by name
    public void remove(String name) {
        if (head == null) {
            System.out.println("Train is empty.");
            return;
        }

        Node temp = head;
        while (temp != null) {
            if (temp.name.equalsIgnoreCase(name)) {

                // if removing head
                if (temp == head) {
                    head = head.next;
                    if (head != null) head.prev = null;
                }
                // if removing tail
                else if (temp == tail) {
                    tail = tail.prev;
                    if (tail != null) tail.next = null;
                }
                // middle removal
                else {
                    temp.prev.next = temp.next;
                    temp.next.prev = temp.prev;
                }

                // update current pointer if needed
                if (temp == current) {
                    current = (temp.next != null) ? temp.next : head;
                }

                // if list becomes empty
                if (head == null) {
                    tail = null;
                    current = null;
                }

                System.out.println("Removed: " + name);
                return;
            }
            temp = temp.next;
        }

        System.out.println("Compartment not found: " + name);
    }

    // Display full train
    public void display() {
        if (head == null) {
            System.out.println("Train is empty.");
            return;
        }

        Node temp = head;
        System.out.println("Train Compartments:");
        while (temp != null) {
            if (temp == current)
                System.out.println("-> " + temp.name + " (Current)");
            else
                System.out.println("   " + temp.name);

            temp = temp.next;
        }
    }
}
