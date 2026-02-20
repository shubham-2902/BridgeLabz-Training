package com.JDBCpractice;
import java.sql.*;
import java.util.Scanner;

public class StatementExample {
    public static void main(String[] args) throws Exception {

        Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/testdb", "root", "password");

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = sc.nextLine();

        System.out.print("Enter password: ");
        String password = sc.nextLine();

        // this single query is responsible for data breach
        String query = "SELECT * FROM users WHERE username='"
                + username + "' AND password='" + password + "'"; // admin or  '5' ='5'
                                                                  // ; DROP  TABLE users;
        

        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery(query);

        if (rs.next()) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Invalid Credentials");
        }

        con.close();
    }
}
