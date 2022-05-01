package com.olympic.cis143.m03.student.homework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import com.olympic.cis143.m03.student.homework.Card.Suit;
import com.olympic.cis143.m03.student.homework.Card.Value;

public class DeckIteratorImpl implements Deck {

	private List<Card> deck = new ArrayList<>();
	private Iterator<Card> itr; 
	
	public DeckIteratorImpl(final boolean jokers) {
		this.createDeck(jokers);
	}
	
	@Override
	public List<Card> getDeck() {
		return deck;
	}

	@Override
	public void shuffle() {
		Collections.shuffle(deck);
		itr = deck.iterator();		// create iterator after shuffle
	}

	@Override
	public boolean hasNext() {
		return itr.hasNext();
	}

	@Override
	public Card dealCard() {
		return itr.next();
	}

	private void createDeck(boolean jokers) {

		// Create 52 card deck
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				if (suit != Suit.NONE && value != Value.JOKER) {
					deck.add(new Card(suit, value));
				}
			}
		}		
		// Add jokers if requested
		if (jokers) {
			deck.add(new Card(Suit.NONE, Value.JOKER));
			deck.add(new Card(Suit.NONE, Value.JOKER));
		}
	}
}
