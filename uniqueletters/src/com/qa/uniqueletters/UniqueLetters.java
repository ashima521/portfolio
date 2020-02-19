package com.qa.uniqueletters;

import java.util.LinkedHashSet;
import java.util.Set;

public class UniqueLetters {
	
	
	public String uniqueLetters(String sentence) {
		Set<Character> uniqueletterlist = new LinkedHashSet<Character>();
		String uniqueletters = " ";
		for(int i=0; i < sentence.length(); i++) {
			uniqueletterlist.add(sentence.charAt(i));
		}
		for(char c: uniqueletterlist) {
			uniqueletters = uniqueletters + c;
		}
		
		System.out.println(uniqueletters);	
		return uniqueletters;
		
	}
//	 	return Arrays.asList()
//	 			     .stream
//	 			     .distinct
//	 			     .collectors

}
