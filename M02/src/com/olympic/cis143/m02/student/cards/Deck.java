package com.olympic.cis143.m02.student.cards;

import java.util.Stack;

public interface Deck {

	public Stack<Card> getDeck();
	
	public void shuffle(); 
	
	public boolean hasNext();
	
	public Card dealCard();

}
