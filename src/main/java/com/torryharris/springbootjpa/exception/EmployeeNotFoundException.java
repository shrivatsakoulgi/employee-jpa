package com.torryharris.springbootjpa.exception;

public class EmployeeNotFoundException extends RuntimeException{

	private static final long serialVersionUID = 5126951093014624140L;

	public EmployeeNotFoundException() {
		super();
	}

	public EmployeeNotFoundException(String message) {
		super(message);
	}
	
}
