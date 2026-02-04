package com.day1.CodeRepoCleaner;
public class CodeRepoCleanerApp {
    public static void main(String[] args) throws Exception {

        String projectPath = "src"; // scan your source folder

        RepoScannerService scanner = new RepoScannerService();
        scanner.scanRepo(projectPath);

        scanner.printReport();
    }
}
