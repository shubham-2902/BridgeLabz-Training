package com.multithreading.downloadmanager;
public class DownloadManagerThread {
    public static void main(String[] args) throws InterruptedException {

        FileDownloader d1 = new FileDownloader("Document.pdf");
        FileDownloader d2 = new FileDownloader("Image.jpg");
        FileDownloader d3 = new FileDownloader("Video.mp4");

        d1.start();
        d2.start();
        d3.start();

        d1.join();
        d2.join();
        d3.join();

        System.out.println("All downloads complete!");
    }
}
