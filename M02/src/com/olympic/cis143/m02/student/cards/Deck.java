package com.olympic.cis143.m02.student.cards;

import java.util.Stack;

public interface Deck {

	// returns the deck
	Stack<Card> getDeck();

	// randomize and shuffle the deck of cards.
	void shuffle();

	//return True if the deck has cards remaining else false.
	boolean hasNext();

	/* Always call the hasNext() method before calling this method.
	 This method should get the next card in the deck.
	 If the deck is empty it should through a RuntimeException.
	 */
	Card dealCard();

}