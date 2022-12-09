package com.cognixia.jump.ems;

public class InvalidInputException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	String message;
	
	public InvalidInputException() {
		this.message = "Invalid Input";
	}

	public InvalidInputException(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "InvalidInputException: " + message;
	}
	
	
	
}
