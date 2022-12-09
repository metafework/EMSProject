//package com.cognixia.jump.ems;

import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

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
			int option=0;
			String strOption;
			;
			try {
				option = sc.nextInt();
				strOption=Integer.toString(option);
				final Pattern pattern = Pattern.compile("^[1-5]$");
			    if (!pattern.matcher(strOption).matches()) {
			        throw new IllegalArgumentException("Invalid String");
			    }
			} catch (Exception e) {
				System.out.println("Invalid Option.");
				//sc.next();
				continue;
			}
			//int option=promptUserOption();
			//break;
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
				try {
					System.out.println("Enter Employee Id: ");
					int id = sc.nextInt();
					System.out.println("Employees new salary:");
					float salary=sc.nextFloat();
					newCompany.updateEmployeeSalary(id, salary);
					System.out.println("Employee was updated.");
				} catch(Exception e){
					System.out.println("Invalid id!");
					sc.next();
				} 
				break;
			case 3:
				System.out.println("Option 3");
				System.out.print("Enter Employee Id: ");

				try {
					int id = sc.nextInt();
					newCompany.removeEmployee(id);
					System.out.println("Employee removed");
				} catch (Exception e) {
					e.printStackTrace();
				}
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
//	public static void promptEmployeeInfo() {
//		Scanner sc=new Scanner(System.in);
//		try {
//			System.out.println("Enter Employee's First name.");
//			String firstName=sc.nextLine();
//			System.out.println("Enter Employee's Last name.");
//			String lastName=sc.nextLine();
//			System.out.println("Enter Employee's Salary.");
//			float salary=sc.nextFloat();
//		}catch(Exception e){
//			e.printStackTrace();
//		}
//		
//	}

	//// Method for listing all current employees ////
	//// Satisfies stream use requirement /////
	public static void listEmployees(Company company) {
		List<Employee> employees = company.getEmployees();
		System.out.println("--- List of employees ---");
		System.out.println("Count: " + employees.size() + "\n");

		employees.stream()
			.forEach(employee -> System.out.println(employee.toString()));
		System.out.println();
	}

}
