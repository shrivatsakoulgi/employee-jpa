package com.torryharris.springbootjpa.exception;

public class InvalidEmployeeDataException extends RuntimeException{

	private static final long serialVersionUID = -6164510632838251147L;

	public InvalidEmployeeDataException() {
		super();	
	}

	public InvalidEmployeeDataException(String message) {
		super(message);
	}
	
}
