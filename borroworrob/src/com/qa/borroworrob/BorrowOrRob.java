package com.qa.borroworrob;

public class BorrowOrRob {

	
	public boolean palindrome(String sentence) {
		//1) ignore case;
		String sen = sentence.replace(" ", "").toLowerCase();
//		//2) ignore spaces; 
//		   // -> iteration 
//		   // -> check for spaces
//		   // -> add letter to new String
//		              //OR
//			// -> use .replace(" ", "")
//		
//		//3) check if forward is same as back
		String reverseString = " ";
		for(int i = sen.length()-1; i>= 0; i--) {
			reverseString = reverseString + sen.charAt(i);
		}
		return sen.equals(reverseString);
		   
		// -> String builder;
//      sentence = sentence.replace(" ", "").toLowerCase();
//      StringBuilder stringBuilder = new StringBuilder();	
//      stringBuilder.append(sentence);
//      stringBuilder.reverse();
//      return sentence.equals(stringBuilder.toString());
//		
		
 	}

}
