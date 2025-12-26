package com.classandobject.level1;

public class EmployeeDetail {
	
	//non-static variables
		String name;
		int id;
		double salary;

		//Constructor
		EmployeeDetail(String name, int id,double salary){
			this.name=name;
			this.id=id;
			this.salary=salary;
		}

		//creating method to display employee details
		public  void displayEmployee() {
			System.out.println("Employee Name: "+name);
			System.out.println("Employee id: "+id);
			System.out.println("Employee Salary: "+salary);
		}

	
	
		//creating method to display employee details
	public static void main(String[] args) {
		EmployeeDetail emp=new EmployeeDetail("Rohan",1,500000);//calling constructor
		emp.displayEmployee();//calling the display method


	}

}
