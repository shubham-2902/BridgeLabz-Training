package com.JUnit;

public class DivideZero {
	

	    public int divide(int a, int b) {
	        if (b == 0) {
	            throw new ArithmeticException("Division by zero is not allowed");
	        }
	        return a / b;
	    }
	}

