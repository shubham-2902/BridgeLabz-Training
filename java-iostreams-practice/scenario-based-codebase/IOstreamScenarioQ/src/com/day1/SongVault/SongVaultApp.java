package com.day1.SongVault;
import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.util.stream.*;

public class SongVaultApp {

    public static void main(String[] args) {

        MediaLibrary<Song> library = new MediaLibrary<>();
        File folder = new File("songs"); 

        Pattern p = Pattern.compile("Title: (.*)|Artist: (.*)|Duration: (.*)|Genre: (.*)");

        for (File file : folder.listFiles()) {
            try (BufferedReader br = new BufferedReader(new FileReader(file))) {

                String line, title = "", artist = "", duration = "", genre = "";

                while ((line = br.readLine()) != null) {
                    Matcher m = p.matcher(line);
                    if (m.find()) {
                        if (m.group(1) != null) title = m.group(1);
                        if (m.group(2) != null) artist = m.group(2);
                        if (m.group(3) != null) duration = m.group(3);
                        if (m.group(4) != null) genre = m.group(4);
                    }
                }

                library.add(new Song(title, artist, duration, genre));

            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        List<Song> songs = library.getAll();

        //  Group by Genre
        Map<String, List<Song>> genreMap =
                songs.stream().collect(Collectors.groupingBy(s -> s.genre));

        // Unique Artists
        Set<String> artists =
                songs.stream().map(s -> s.artist).collect(Collectors.toSet());

        // Sort by Title
        List<Song> sortedSongs =
                songs.stream().sorted(Comparator.comparing(s -> s.title)).collect(Collectors.toList());

        System.out.println("\n--- Songs by Genre ---");
        genreMap.forEach((g, list) -> System.out.println(g + " -> " + list));

        System.out.println("\n--- Unique Artists ---");
        artists.forEach(System.out::println);

        System.out.println("\n--- Sorted Songs ---");
        sortedSongs.forEach(System.out::println);
    }
}
