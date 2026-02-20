package com.JDBCpractice;
import java.sql.*;
import java.util.Scanner;

public class PreparedStatementExample {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // creating a query with placeholder
        String query =
                "SELECT * FROM users WHERE username=? AND password=?";

        PreparedStatement ps = con.prepareStatement(query);

        // here we are binding the data
        ps.setString(1, username);
        ps.setString(2, password);

        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            System.out.println("Login Successful");// returns true only if rows are affected
        } else {
            System.out.println("Invalid Credentials");
        }

        con.close();
    }
}
