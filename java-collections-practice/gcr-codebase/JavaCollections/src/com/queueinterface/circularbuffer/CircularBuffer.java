package com.queueinterface.circularbuffer;
import java.util.*;

class CircularQueue {
    private int[] arr;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = 0;
        size = 0;
    }

    // Insert element, overwrite if full
    public void enqueue(int value) {
        arr[rear] = value;
        rear = (rear + 1) % capacity;

        if (size < capacity) {
            size++;
        } else {
            // overwrite oldest => move front forward
            front = (front + 1) % capacity;
        }
    }

    public List<Integer> getBufferElements() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(arr[(front + i) % capacity]);
        }
        return list;
    }
}

public class CircularBuffer {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter buffer size: ");
        int capacity = sc.nextInt();

        CircularQueue buffer = new CircularQueue(capacity);

        System.out.print("Enter number of elements to insert: ");
        int n = sc.nextInt();

        System.out.println("Enter " + n + " values:");
        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            buffer.enqueue(val);
            System.out.println("After inserting " + val + " -> Buffer: " + buffer.getBufferElements());
        }

        sc.close();
    }
}
