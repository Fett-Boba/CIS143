package com.boba.practiceproblems;

public class Maskify {
    public static String maskify(String str) {
 
    	String newStr = "";
    	
		if (str.length() > 4) {
			for (int i = 0; i < str.length() - 4; i++) {
				newStr = newStr.concat("#");
			}
			newStr = newStr.concat(str.substring(str.length() - 4));
		} else {
			newStr = str;
		}
		return newStr;
    }
}