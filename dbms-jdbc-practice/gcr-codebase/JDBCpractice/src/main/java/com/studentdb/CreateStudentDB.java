package com.studentdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateStudentDB {

    // Method to create DB and table
    public static void createDatabaseAndTable() {

        String createDb = "CREATE DATABASE IF NOT EXISTS student_db";
        String useDb = "USE student_db";
        String createTable =
                "CREATE TABLE IF NOT EXISTS students (\n" +
                "  id INT AUTO_INCREMENT PRIMARY KEY,\n" +
                "  name VARCHAR(100) NOT NULL,\n" +
                "  email VARCHAR(100) UNIQUE NOT NULL,\n" +
                "  age INT,\n" +
                "  grade VARCHAR(10),\n" +
                "  enrollment_date DATE\n" +
                ")";

        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement()) {

            stmt.executeUpdate(createDb);
            System.out.println("Database created (or already exists)");

            stmt.execute(useDb);
            System.out.println("Using student_db");

            stmt.executeUpdate(createTable);
            System.out.println("Table students created successfully");

        } catch (SQLException e) {
            System.err.println("Error while creating database/table: " + e.getMessage());
            e.printStackTrace();
        }
    }


    
    public static void main(String[] args) {

        // Create DB and Table
        createDatabaseAndTable();

        
    }
}