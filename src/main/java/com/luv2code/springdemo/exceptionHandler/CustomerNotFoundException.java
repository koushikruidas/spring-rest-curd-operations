package com.luv2code.springdemo.exceptionHandler;

public class CustomerNotFoundException extends RuntimeException {
	

	public CustomerNotFoundException() {}
	
	public CustomerNotFoundException(String message, Throwable cause) {
		super(message, cause);
	}

	public CustomerNotFoundException(String message) {
		super(message);
	}

	public CustomerNotFoundException(Throwable cause) {
		super(cause);
	}

}