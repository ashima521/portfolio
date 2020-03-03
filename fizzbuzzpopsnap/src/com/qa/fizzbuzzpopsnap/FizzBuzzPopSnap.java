package com.qa.fizzbuzzpopsnap;

public class FizzBuzzPopSnap {
	
	public String fizzBuzzPopSnap(int num) {
		
		String answer = "";
		Integer x = num;
		
		if(num % 3 == 0) {
			answer += "fizz";
		}
		if(num % 5 == 0) {
			answer += "buzz";
		}
		if(num % 7 ==0) {
			answer += "pop";
		}
		if(num % 11 ==0) {
			answer += "snap";
		}
		if (num % 3 != 0 && num % 5 != 0 && num % 7 != 0 && num % 11 != 0){
			answer += x.toString();
		}
		return answer;
		
	}

}
