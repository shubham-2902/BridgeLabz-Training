package com.multithreading.downloadmanager;
import java.util.Random;

class FileDownloader extends Thread {
    private String fileName;
    private Random random = new Random();

    public FileDownloader(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void run() {
        for (int i = 0; i <= 100; i += 10) {
            System.out.println("[" + Thread.currentThread().getName() +
                    "] Downloading " + fileName + ": " + i + "%");

            try {
                Thread.sleep(random.nextInt(400) + 100); // random delay 100–500ms
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(fileName + " download finished.");
    }
}
