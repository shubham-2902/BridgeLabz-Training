package com.studentdb;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class DeleteStudentRecord {
     public static void deleteStudent(int studentId) {
    	 String sql = "DELETE FROM students WHERE id =?";
    	 
    	 try(Connection con = DatabaseConnection.getConnection();
    		 PreparedStatement pstmt = con.prepareStatement(sql)){
    		 
    		 pstmt.setInt(1,studentId);
    		 
    		 int rowsAffected = pstmt.executeUpdate();
    		 
    		 if(rowsAffected > 0) {
    			 System.out.println("Student deleted successfully");
    		 }else {
    			 System.out.println("Student not found!");
    		 }
    		 
    	 }catch (Exception e) {
			System.out.println(e.getMessage());
		}
    	 
    	 
     }
     
     
     
    // Delete with confirmation
     public static boolean deleteStudentSafe(int studentId) {
     
     // First check if student exists
     String checkSql = "SELECT COUNT(*) FROM students WHERE id = ?";
     String deleteSql = "DELETE FROM students WHERE id = ?";

     try (Connection conn = DatabaseConnection.getConnection()) {
     // Check existence
     try (PreparedStatement checkStmt = conn.prepareStatement(checkSql)) {
     checkStmt.setInt(1, studentId);
     ResultSet rs = checkStmt.executeQuery();
     rs.next();
     if (rs.getInt(1) == 0) {
     System.out.println("Student not found!");
     return false;
     }
     }
     // Delete
     try (PreparedStatement deleteStmt = conn.prepareStatement(deleteSql)) {
     deleteStmt.setInt(1, studentId);
     deleteStmt.executeUpdate();
     System.out.println("Student deleted successfully!");
     return true;
     }
     } catch (SQLException e) {
     e.printStackTrace();
     return false;
     }
     
     }
     
     public static void main(String[] args) {
		//deleteStudent(2);
		deleteStudentSafe(7);
	}
}