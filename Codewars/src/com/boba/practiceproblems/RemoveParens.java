package com.boba.practiceproblems;

public class RemoveParens {

	
	public static void main (String [] args) {
		//removeParentheses("example(unwanted thing)example");
		//removeParentheses("example (unwanted thing) example");
		//removeParentheses("a (bc d)e");
		//removeParentheses("a(b(c))");
		removeParentheses("hello example (words(more words) here) something");
		//removeParentheses("(first group) (second group) (third group)");
	}
	
    public static String removeParentheses(String str) {

    	boolean skipChar = false;
    	String newStr = "";
    	int numLeftParens=0;
    	int numRightParens = 0;
    	
    	for (int i = 0; i < str.length(); i++) {
    		if (str.charAt(i) == '(' ) {
    			skipChar = true;
    			numLeftParens ++;
    		} else if (str.charAt(i) == ')' ) {
    			skipChar = false;
    			numRightParens ++;
    		}    		
    		if (!skipChar &&  str.charAt(i) != ')' && (numLeftParens == numRightParens)) {
    			newStr = newStr + str.charAt(i);
    		}
    	}
    	System.out.println(newStr);
    	return ""; 
    }
}
