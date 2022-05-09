package com.boba.practiceproblems;

/* An ATM has banknotes of nominal values 10, 20, 50, 100, 200 and 500 dollars. You can consider that there is a large enough supply of each of these banknotes.
You have to write the ATM's function that determines the minimal number of banknotes needed to honor a withdrawal of n dollars, with 1 <= n <= 1500.
Return that number, or -1 if it is impossible.
 */

class ATM {
	public int solve (int n) {
		int quotient = n / 500;	
		int remainder = n % 500;
		int numNotes = 0;
		numNotes = numNotes + quotient ;
		int [] divisor = {200, 100, 50, 20, 10};
		for (int i = 0; i < divisor.length; i++) {
			quotient = remainder/divisor[i];
		    remainder %= divisor[i]; 
		    numNotes = numNotes + quotient;
		}
		return remainder == 0 ? numNotes : -1; 
	}
}
