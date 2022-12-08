package com.cognixia.jump.ems;

import java.util.Scanner;

public class UserInterface {

	public static void main(String[] args) {
		run();
	}
	
	public static void run() {
		Company newCompany = new Company("EMJ");
		System.out.println("Welcome to the Employee Management System");
		String[] options = {
				"1: Add new employee",
				"2: Update employee information",
				"3: ...",
				"4: ..."
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
				newCompany.addEmployee(1234, "Nicholas", "LastName", 50000);
				System.out.println("Employee added");
				break;
			case 2:
				System.out.println("Option 2");
				break;
			case 3:
				System.out.println("Option 3");
				break;
			case 4:
				System.out.println("Option 4");
				listEmployees();
				break;
			case 5: // Exit
				System.out.println("Option 5");
				running = false;
			}
		}
		sc.close();
	}
	
	public static void listEmployees() {
		System.out.println("List of employees");
	}

}
