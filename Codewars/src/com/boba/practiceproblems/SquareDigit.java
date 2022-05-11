package com.boba.practiceproblems;

public class SquareDigit {

	  public int squareDigits(int n) {
		    
		  String strIn = Integer.toString(n);
		  String strOut = "";		
		  
		  for (int i = 0; i < strIn.length(); i++) {
			  int valSquared = Character.getNumericValue(strIn.charAt(i)) * Character.getNumericValue(strIn.charAt(i));
			  strOut = strOut.concat(Integer.toString(valSquared));
		  }
		  
		  return Integer.parseInt(strOut);
	  }
	
}
