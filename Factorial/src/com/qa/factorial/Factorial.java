package com.qa.factorial;

public class Factorial {

	public static void main (String[] args) {
		
		int val = 5;
		int factorial = 1;
	
		for(int n = 1; n < val; n++) {
			    int factorial  = factorial * n;
			  
			System.out.println(factorial);
		}
	}
}
