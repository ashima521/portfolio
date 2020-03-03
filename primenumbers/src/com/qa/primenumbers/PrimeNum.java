package com.qa.primenumbers;

public class PrimeNum {
	
	
	boolean isPrime = true;
	
	public void primeNumber(int maxNum) {
		
		for(int num = 1; num <= maxNum; num++) {
			
			boolean isPrime = true;
			if(num == 1) {
				isPrime = false;
			}
			for(int i = 2; i <= (int) Math.sqrt(num); i++) {
				if(num%i == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				System.out.println(num);
			}
		}
	}

}
