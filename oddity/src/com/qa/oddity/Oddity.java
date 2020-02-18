package com.qa.oddity;

import java.util.ArrayList;

public class Oddity {
	public static void main (String[] args) {
			
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(1);
		num.add(2);
		num.add(3);
		num.add(4);
		
		for(int nums: num) {
			if(nums % 2 != 0) {
				System.out.println(nums);
			}
			
		
//		for(int i = 0; i < num.length; i++)  {
//		
//			if(num[i] % 2 != 0) {
//				System.out.println(num[i]);
//			}
		}
	}

}
	
