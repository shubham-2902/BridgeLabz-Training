package com.day1.CodeRepoCleaner;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaFileAnalyzer {

    // Method names should start with lowercase
    private static final Pattern BAD_METHOD_PATTERN =
            Pattern.compile("void [A-Z][a-zA-Z]*\\(");

    // Import pattern
    private static final Pattern IMPORT_PATTERN =
            Pattern.compile("import (.*);");

    public FileCategory analyze(Path file) throws IOException {
        List<String> lines = Files.readAllLines(file);

        boolean hasWarning = false;
        boolean hasError = false;

        Set<String> imports = new HashSet<>();
        String content = String.join("\n", lines);

        for (String line : lines) {

            // Detect bad method naming
            if (BAD_METHOD_PATTERN.matcher(line).find()) {
                hasWarning = true;
            }

            // Collect imports
            Matcher m = IMPORT_PATTERN.matcher(line);
            if (m.find()) imports.add(m.group(1));
        }

        // Check unused imports
        for (String imp : imports) {
            String className = imp.substring(imp.lastIndexOf('.') + 1);
            if (!content.contains(className)) {
                hasError = true;
            }
        }

        if (hasError) return FileCategory.ERRORS;
        if (hasWarning) return FileCategory.WARNINGS;
        return FileCategory.VALID;
    }
}
