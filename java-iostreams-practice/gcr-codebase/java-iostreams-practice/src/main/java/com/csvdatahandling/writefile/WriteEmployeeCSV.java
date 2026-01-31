package com.csvdatahandling.writefile;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteEmployeeCSV {

	public static void main(String[] args) {

		String fileName = "employees.csv"; // Output file

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {

			// Header
			bw.write("ID,Name,Department,Salary");
			bw.newLine();

			// Records
			bw.write("201,Amit,HR,45000");
			bw.newLine();
			bw.write("202,Sneha,IT,60000");
			bw.newLine();
			bw.write("203,Rahul,Finance,55000");
			bw.newLine();
			bw.write("204,Anjali,Marketing,48000");
			bw.newLine();
			bw.write("205,Vikram,IT,62000");
			bw.newLine();

			System.out.println("CSV file created successfully!");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
