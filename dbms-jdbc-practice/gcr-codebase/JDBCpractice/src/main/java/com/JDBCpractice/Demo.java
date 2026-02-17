package com.JDBCpractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your name");
	String name = sc.next();
	System.out.println("Enter your email");
	String email = sc.next();
	System.out.println("Enter your password");
	String pass =sc.next();
	System.out.println("Enter your gender");
	String gender = sc.next();
	
	// loading the driver
	Class.forName("com.mysql.cj.jdbc.Driver");
	
	//establish the connection
	 Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/practice_jdbc","root","RadheRadhe");
	 // create statement
    PreparedStatement ps =  con.prepareStatement("Insert into register values(?,?,?,?)");
    ps.setString(1,name);
    ps.setString(2,email);
    ps.setString(3,pass);
    ps.setString(4, gender);
    // execute 
    int i = ps.executeUpdate();
    // process the result
    if(i>0) {
    	System.out.println("Succees");
    }
    else
    {
    	System.out.println("Fail");
    }
    // close the connection
    con.close();
    ps.close();
    sc.close();
    
}

	
}
