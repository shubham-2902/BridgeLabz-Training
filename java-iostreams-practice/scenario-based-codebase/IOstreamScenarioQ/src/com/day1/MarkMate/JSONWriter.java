package com.day1.MarkMate;

import java.io.*;
import java.util.*;

public class JSONWriter {

    public static void writeJSON(List<Student> students, String filePath) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filePath))) {

            bw.write("[\n");

            for (int i = 0; i < students.size(); i++) {
                Student s = students.get(i);

                bw.write("  {\n");
                bw.write("    \"name\": \"" + s.name + "\",\n");
                bw.write("    \"maths\": " + s.maths + ",\n");
                bw.write("    \"science\": " + s.science + ",\n");
                bw.write("    \"english\": " + s.english + ",\n");
                bw.write("    \"total\": " + s.total + ",\n");
                bw.write("    \"average\": " + s.average + ",\n");
                bw.write("    \"grade\": \"" + s.grade + "\"\n");
                bw.write("  }");

                if (i < students.size() - 1) bw.write(",");
                bw.write("\n");
            }

            bw.write("]");
            System.out.println("JSON report generated successfully!");

        } catch (IOException e) {
            System.out.println("Error writing JSON: " + e.getMessage());
        }
    }
}
