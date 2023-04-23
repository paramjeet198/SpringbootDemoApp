package com.example.demo.testing;

public class MyCustomException extends RuntimeException{
	  private String message;

	public MyCustomException(String message) {
		this.message = message;
	}
	
	public MyCustomException( ) {
	}
	  
	  
}
