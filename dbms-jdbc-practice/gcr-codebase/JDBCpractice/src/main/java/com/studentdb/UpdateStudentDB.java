package com.studentdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class UpdateStudentDB {
	
    public static void updateStudentGrade(int studentId, String newGrade) {
    	String sql = "UPDATE students SET grade = ? WHERE id = ?";

    	try (Connection conn = DatabaseConnection.getConnection();
    	PreparedStatement pstmt = conn.prepareStatement(sql)) {

    	pstmt.setString(1, newGrade);
    	pstmt.setInt(2, studentId);

    	int rowsAffected = pstmt.executeUpdate();

    	if (rowsAffected > 0) {
    	System.out.println("Grade updated successfully!");
    	} else {
    	System.out.println("Student not found!");
    	}

    	} catch (SQLException e) {
    	e.printStackTrace();
    	}
    }
    
    
    
    public static void updateStudentInfo(int id, String name, String email, int age) {
    	String sql = "UPDATE students SET name = ?, email = ?, age = ? WHERE id = ?";

    	try (Connection conn = DatabaseConnection.getConnection();

    	PreparedStatement pstmt = conn.prepareStatement(sql)) {

    	pstmt.setString(1, name);
    	pstmt.setString(2, email);
    	pstmt.setInt(3, age);
    	pstmt.setInt(4, id);

    	int rowsAffected = pstmt.executeUpdate();
    	System.out.println(rowsAffected + " row(s) updated!");

    	} catch (SQLException e) {
    	e.printStackTrace();
    	}
    	
    }
    
    public static void main(String[] args) {
		updateStudentGrade(1, "D");
		updateStudentInfo(2, "Aman", "jane.new@email.com", 23);
	}
}