package com.bankdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class TransactionPerform {

    public static void transferMoney(int fromAccount, int toAccount, double amount) {
        Connection conn = null;

        try {
            conn = DatabaseConnection.getConnection();

            // Disable auto-commit (start transaction)
            conn.setAutoCommit(false);

            // Deduct from sender
            String deductSql = "UPDATE accounts SET balance = balance - ? WHERE account_id = ?";
            PreparedStatement deductStmt = conn.prepareStatement(deductSql);
            deductStmt.setDouble(1, amount);
            deductStmt.setInt(2, fromAccount);
            int rows1 = deductStmt.executeUpdate();

            // Add to receiver
            String addSql = "UPDATE accounts SET balance = balance + ? WHERE account_id = ?";
            PreparedStatement addStmt = conn.prepareStatement(addSql);
            addStmt.setDouble(1, amount);
            addStmt.setInt(2, toAccount);
            int rows2 = addStmt.executeUpdate();

            // Check if both operations succeeded
            if (rows1 > 0 && rows2 > 0) {
                conn.commit(); // Commit transaction
                System.out.println("Transfer successful!");
            } else {
                conn.rollback(); // Rollback on failure
                System.out.println("Transfer failed - rolled back!");
            }

        } catch (SQLException e) {
            try {
                if (conn != null) {
                    conn.rollback(); // Rollback on exception
                    System.out.println("Transaction rolled back due to error!");
                }
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            e.printStackTrace();

        } finally {
            try {
                if (conn != null) {
                    conn.setAutoCommit(true); // Restore auto-commit
                    conn.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        transferMoney(101, 102, 500.00);
    }
}