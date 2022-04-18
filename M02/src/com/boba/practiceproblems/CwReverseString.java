package com.boba.practiceproblems;

public class CwReverseString {

	  public static String solution(String str) {
		    String newStr = "";
		    for (int i = str.length() - 1; i >= 0; i-- ) {
				newStr = newStr + str.charAt(i);
			}
		    return newStr;
	  }
}
