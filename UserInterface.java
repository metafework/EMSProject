package com.cognixia.jump.ems;

import java.util.List;
import java.util.Scanner;

public class UserInterface {
	
		static int employeeIdGenerator=1000;// Generates Employee ID starting with 1000
		
		
	public static void main(String[] args) {
		run();
	}
	
	/// Method runs UI and Implements UI Logic////
	/// Declares and Instantiates Company objects///
	public static void run() {
		Company newCompany = new Company("EMJ");
		System.out.println("Welcome to the Employee Management System");
		String[] options = {
				"1: Add new employee",
				"2: Update employee information",
				"3: Remove employee by id",
				"4: List All Employees",
				"5: Exit program"
		};
		
		Scanner sc = new Scanner(System.in);
		boolean running = true;
		while(running) {
			System.out.println("Select an option:");
			System.out.println(String.join("\n", options));
			
			int option;
			try {
				option = sc.nextInt();
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
			
			switch(option) {
			case 1:
				System.out.println("Option 1:");
				try {
					System.out.println("Enter new Employee's First name.");
					String firstName=sc.next();
					System.out.println("Enter new Employee's Last name.");
					String lastName=sc.next();
					System.out.println("Enter "+firstName+" "+lastName +"'s Salary.");
					float salary=sc.nextFloat();
					
					newCompany.addEmployee(employeeIdGenerator++, firstName, lastName, salary);
				}catch(Exception e){
					e.printStackTrace();
				}
				
				System.out.println("Employee added.");
				break;
			case 2:
				System.out.println("Option 2");
				break;
			case 3:
				System.out.println("Option 3");
				newCompany.removeEmployee(1000);
				break;
			case 4: // Lists all current employees
				System.out.println("Option 4");
				listEmployees(newCompany);
				break;
			case 5: // Exit
				System.out.println("Option 5");
				running = false;
			}
		}
		sc.close();
	}
	
	//// Method for prompting for Employee info upon addition ////
	public static void promptEmployeeInfo() {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter Employee's First name.");
			String firstName=sc.nextLine();
			System.out.println("Enter Employee's Last name.");
			String lastName=sc.nextLine();
			System.out.println("Enter Employee's Salary.");
			float salary=sc.nextFloat();
		}catch(Exception e){
			e.printStackTrace();
		}
		
	}
	//// Method for listing all current employees ////
	//// Satisfies stream use requirement /////
	public static void listEmployees(Company company) {
		System.out.println("List of employees:");
		List<Employee> employees = company.getEmployees();
		employees.stream()
			.forEach(employee -> System.out.println(employee.toString()));
		System.out.println();
	}

}
