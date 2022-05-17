package com.boba.practiceproblems;

public class CreatePhoneNumbers {

	public static String createPhoneNumber(int[] numbers) {
	    
		String str = "";
		for (int i = 0; i < numbers.length; i++) {
			str += numbers[i];
		}
		return String.format("(%s) %s-%s", str.substring(0, 3), str.substring(3, 6), str.substring(6, 10));
	  }
	
}