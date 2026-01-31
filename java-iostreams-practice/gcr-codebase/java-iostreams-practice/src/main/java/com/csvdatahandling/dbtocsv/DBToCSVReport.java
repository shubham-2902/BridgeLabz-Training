package com.csvdatahandling.dbtocsv;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBToCSVReport {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/companydb";
        String user = "root";
        String password = "root";

        String query = "SELECT id, name, department, salary FROM employees";

        try (
            Connection con = DriverManager.getConnection(url, user, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            BufferedWriter bw = new BufferedWriter(new FileWriter("employee_report.csv"))
        ) {

            // Write CSV Header
            bw.write("Employee ID,Name,Department,Salary");
            bw.newLine();

            // Write Data Rows
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String dept = rs.getString("department");
                double salary = rs.getDouble("salary");

                bw.write(id + "," + name + "," + dept + "," + salary);
                bw.newLine();
            }

            System.out.println("CSV Report Generated Successfully!");

        } catch (java.sql.SQLException e) {
            System.out.println("Database not available or connection failed.");
        } catch (Exception e) {
            System.out.println("Error writing CSV file.");
            e.printStackTrace();
        }
    }
}
