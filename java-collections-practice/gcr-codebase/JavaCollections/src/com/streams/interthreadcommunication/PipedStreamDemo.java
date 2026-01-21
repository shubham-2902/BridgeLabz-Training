package com.streams.interthreadcommunication;
import java.io.*;

public class PipedStreamDemo {

    public static void main(String[] args) {

        try {
            // Create piped streams
            PipedOutputStream pos = new PipedOutputStream();
            PipedInputStream pis = new PipedInputStream(pos); // connect input with output

            // Writer Thread
            Thread writerThread = new Thread(() -> {
                try {
                    String message = "Hello from Writer Thread!";
                    pos.write(message.getBytes());  // write bytes
                    pos.close(); // IMPORTANT: close so reader knows data is finished
                } catch (IOException e) {
                    System.out.println("Writer Error: " + e.getMessage());
                }
            });

            // Reader Thread
            Thread readerThread = new Thread(() -> {
                try {
                    int data;
                    System.out.print("Reader Received: ");

                    while ((data = pis.read()) != -1) { // read until stream ends
                        System.out.print((char) data);
                    }

                    pis.close();
                } catch (IOException e) {
                    System.out.println("Reader Error: " + e.getMessage());
                }
            });

            // Start both threads
            readerThread.start();
            writerThread.start();

            // Wait for both to finish (prevents premature program end)
            writerThread.join();
            readerThread.join();

        } catch (IOException e) {
            System.out.println("Pipe Connection Error: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted: " + e.getMessage());
        }
    }
}
