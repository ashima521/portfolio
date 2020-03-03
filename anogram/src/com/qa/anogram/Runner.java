package com.qa.anogram;

public class Runner {
	
	public static void main(String[] args) {
		
		Anogram word = new Anogram();
		System.out.println(word.anogram("listen", "silent"));
	}

}
