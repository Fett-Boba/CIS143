package com.boba.practiceproblems;

/* An ATM has banknotes of nominal values 10, 20, 50, 100, 200 and 500 dollars. You can consider that there is a large enough supply of each of these banknotes.
You have to write the ATM's function that determines the minimal number of banknotes needed to honor a withdrawal of n dollars, with 1 <= n <= 1500.
Return that number, or -1 if it is impossible.
 */

class ATM {
	
	public static void main (String [] args) {
		
		int n = 200;
		int numNotes = 0;
		
		int dividend = n / 500; 
		int remainder = n % 500;
		numNotes = numNotes + dividend;
		
		dividend = remainder/200;
		remainder %= 200; 
		numNotes = numNotes + dividend;
		
		dividend = remainder/100;
		remainder %= 100; 
		numNotes = numNotes + dividend;
		
		dividend = remainder/50;
		remainder %= 50; 
		numNotes = numNotes + dividend;
		
		dividend = remainder/20;
		remainder %= 20; 
		numNotes = numNotes + dividend;

		dividend = remainder/10;
		remainder %= 10; 
		numNotes = numNotes + dividend;
	
		if (remainder != 0) {
			return -1;
		} else {
			return numNotes;
		}
	}
	
}
