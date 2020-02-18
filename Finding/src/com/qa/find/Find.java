package com.qa.find;

public class Find {
	
    	public boolean find(String sentence, int num, char character) {
    	
    	//return sentence.substring(num-1, num).equals(String.valueOf(character));
    	
   
    	return sentence.charAt(num-1) == character;
    	}
	}




