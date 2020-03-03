package com.qa.anogram;

import java.util.ArrayList;
import java.util.Collections;

public class Anogram {
	
	public boolean anogram(String a, String b) {
	
		
		
		String firstWord = a.replace(" ", "").toLowerCase();
		String secondWord = b.replace(" ", "").toLowerCase();
		
		ArrayList<Character> lista = new ArrayList<> ();
		ArrayList<Character> listb = new ArrayList<> ();
		
		for(int i = 0; i < firstWord.length(); i++) {
				lista.add(firstWord.charAt(i));
		}
		
		for(int j = 0; j < secondWord.length(); j++) {
			listb.add(secondWord.charAt(j));
			}
		Collections.sort(lista);
		Collections.sort(listb);
		
	
		return lista.equals(listb);
		
		
	
	}

}
