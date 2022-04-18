package com.olympic.cis143.m02.student.cards;

import java.util.Collections;
import java.util.Stack;
import com.olympic.cis143.m02.student.cards.Card.Suit;
import com.olympic.cis143.m02.student.cards.Card.Value;

public class DeckImpl implements Deck {

	private Stack<Card> deck = new Stack<>();

	/**
	 * Constructor.
	 * @param jokers True if you want jokers in this deck.
	 */
	public DeckImpl(final boolean jokers) {
		this.createDeck(jokers);
	}

	/**
	 * Create the deck - with or without Jokers depending on what the user wants.
	 * @param jokers True if you want jokers added to the deck.
	 */
	private void createDeck(final boolean jokers) {

		// Create standard 52 card deck by looping through the suits, and then values for each suit.  
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				// Omit the jokers, and push the new card onto the deck stack
				if (suit != Suit.NONE && value != Value.JOKER) {
					Card card = new Card(suit, value);
					deck.push(card);
				}
			}
		}		

		// Add jokers if requested, and push them onto the stack.
		if (jokers) {
			for (int i = 0; i <2; i++) {
				Card card = new Card(Suit.NONE, Value.JOKER);
				deck.push(card);
			}
		}
	}

	/**
	 * Gets the deck.
	 * @return The deck.
	 */
	public Stack<Card> getDeck() {
		return deck;
	}
	/**
	 * Randomize and shuffle the deck of cards.
	 */
	public void shuffle() {
		Collections.shuffle(deck);
	}

	/**
	 * True if the deck has cards remaining else false.
	 * @return
	 */
	public boolean hasNext() {
		return deck.isEmpty() ? false : true;
	}

	/**
	 * This method gets the next card in the deck.
	 * Always call the hasNext() method before calling this method.
	 *
	 * If the deck is empty it should through a RuntimeException.
	 * @return
	 */
	public Card dealCard() {
		try {
			return deck.pop();
		} catch (RuntimeException e) {
			throw new RuntimeException("Deck is empty.");
		}
	}
}
