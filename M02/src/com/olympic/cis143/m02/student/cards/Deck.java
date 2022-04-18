package com.olympic.cis143.m02.student.cards;

import java.util.Stack;

public interface Deck {

	Stack<Card> getDeck();
	
	void shuffle(); 
	
	boolean hasNext();
	
	Card dealCard();

}
