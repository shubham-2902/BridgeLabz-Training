package com.bankdb;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateBankDB {

    public static void createTable() {

        String createDB = "CREATE DATABASE IF NOT EXISTS bank_db";

        String createTable =
                "CREATE TABLE IF NOT EXISTS accounts (" +
                "account_id INT PRIMARY KEY, " +
                "balance DOUBLE" +
                ")";

        try (Connection con = DatabaseConnection.getConnection();
             Statement stmt = con.createStatement()) {

            // Step 1: Create Database
            stmt.execute(createDB);
            System.out.println("Bank DB created successfully.");

            // Step 2: Create table in bank_db
            stmt.execute("USE bank_db");   
            stmt.execute(createTable);

            System.out.println("Accounts table created.");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        createTable();
    }
}
