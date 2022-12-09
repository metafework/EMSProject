//package com.cognixia.jump.ems;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Company {
	// Add departments later
	private String name;
	List<Employee> employees = null;
	
	Company(String name) {
		this.name = name;
		this.employees = new ArrayList<>();
	}
	
	public void addEmployee(int id, String firstName, String lastName, float salary) {
		Employee newEmployee = new Employee(id, firstName, lastName, salary, LocalDate.now());
		employees.add(newEmployee);
	}
	
	public void updateEmployeeSalary(int id, float salary) {
		for(Employee employee : employees) {
			if(employee.getId() == id) {
				employee.setSalary(salary);
			}
		}
	}
	public void updateEmployeeDepartment(int id, String department) {
		for(Employee employee : employees) {
			if(employee.getId() == id) {
				employee.setDepartment(department);
			}
		}
	}
	
	public void removeEmployee(int id) {
		employees.removeIf(employee -> employee.getId() == id);
	}
	
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the employees
	 */
	public List<Employee> getEmployees() {
		return employees;
	}

	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
}
