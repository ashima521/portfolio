package com.qa.find;

public class Find {
	
    public static void main (String[] args) {
		String s = "hello";
		
		System.out.println(s.substring(1, 2));
		if(s.indexOf('e') == 1) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
	
	}

}

