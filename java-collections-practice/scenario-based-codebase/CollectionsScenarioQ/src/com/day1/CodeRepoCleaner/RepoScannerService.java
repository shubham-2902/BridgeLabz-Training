package com.day1.CodeRepoCleaner;
import java.io.IOException;
import java.nio.file.*;
import java.util.*;

public class RepoScannerService {

    private Map<FileCategory, List<Path>> fileMap = new HashMap<>();
    private JavaFileAnalyzer analyzer = new JavaFileAnalyzer();

    public RepoScannerService() {
        for (FileCategory c : FileCategory.values()) {
            fileMap.put(c, new ArrayList<>());
        }
    }

    public void scanRepo(String folderPath) throws IOException {
        Files.walk(Paths.get(folderPath))
                .filter(p -> p.toString().endsWith(".java"))
                .forEach(this::processFile);
    }

    private void processFile(Path file) {
        try {
            FileCategory category = analyzer.analyze(file);
            fileMap.get(category).add(file);
        } catch (Exception e) {
            System.out.println("Error analyzing: " + file);
        }
    }

    public void printReport() {
        fileMap.forEach((cat, files) -> {
            System.out.println("\n" + cat + " FILES:");
            files.forEach(System.out::println);
        });
    }
}
