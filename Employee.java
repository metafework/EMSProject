package com.cognixia.jump.ems;

import java.time.LocalDate;

public class Employee{

		int id;
		String firstName;
		String lastName;
		LocalDate DOE; 
		float salary;
		String department;
		
		public Employee(int id, String firstName, String lastName, float salary, LocalDate DOE)
		{
			this.id = id;
			this.firstName = firstName;
			this.lastName = lastName;
			this.DOE = DOE;
			this.salary = salary;
		}
		
		public String toString()
		{
			return "\nEmployee " + "ID: " + this.id + ", First Name: " + this.firstName +
					", Last Name: " + this.lastName + ", Date of Employment: " + this.DOE +
					", Salary: " + this.salary + ", Department: " + this.department;
		}

		/**
		 * @return the id
		 */
		public int getId() {
			return id;
		}

		/**
		 * @param id the id to set
		 */
		public void setId(int id) {
			this.id = id;
		}

		/**
		 * @return the firstName
		 */
		public String getFirstName() {
			return firstName;
		}

		/**
		 * @param firstName the firstName to set
		 */
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}

		/**
		 * @return the lastName
		 */
		public String getLastName() {
			return lastName;
		}

		/**
		 * @param lastName the lastName to set
		 */
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}

		/**
		 * @return the dOE
		 */
		public LocalDate getDOE() {
			return DOE;
		}

		/**
		 * @param dOE the dOE to set
		 */
		public void setDOE(LocalDate dOE) {
			DOE = dOE;
		}

		/**
		 * @return the salary
		 */
		public float getSalary() {
			return salary;
		}

		/**
		 * @param salary the salary to set
		 */
		public void setSalary(float salary) {
			this.salary = salary;
		}

		/**
		 * @return the department
		 */
		public String getDepartment() {
			return department;
		}

		/**
		 * @param department the department to set
		 */
		public void setDepartment(String department) {
			this.department = department;
		}
	
}

