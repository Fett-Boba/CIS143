package com.olympic.cis143.m02.student.cards;

import java.util.Collections;
import java.util.Stack;
import com.olympic.cis143.m02.student.cards.Card.Suit;
import com.olympic.cis143.m02.student.cards.Card.Value;

/**
 * Note that you can think of the deck implementation as being an iterator in that its creates and used once. Meaning, when a card is
 * dealt it  MUST be removed from the deck.
 */
public class DeckImpl implements Deck {

	/**
	 * This will be the stack object for you to work with.
	 */
	private Stack<Card> deck = new Stack<>();

	/**
	 * Const.
	 * @param jokers True if you want jokers in this deck.
	 */
	public DeckImpl(final boolean jokers) {
		this.createDeck(jokers);
	}

	/**
	 * Private. THis is the place where you will need to create a deck of cards. You can iterate throug
	 * ther enums in Card.
	 *
	 * Some rules:
	 * ============
	 * 1. Note the boolean jokers parameter. If true add the Jokers to the deck with a Card.Suite.NONE.
	 * 2. Do not create cards, other than jokers, with a Card.Suite.NONE.
	 *
	 * Outcome
	 * ========
	 * if jokers == true, 54 cards will be created.
	 * if jokers == false, 52 cards are created.
	 *
	 * @param jokers True if you want jokers added to the deck.
	 */
	private void createDeck(final boolean jokers) {

		// Create standard 52 card deck
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				if (suit != Suit.NONE && value != Value.JOKER) {
					Card card = new Card(suit, value);
					deck.push(card);
				}
			}
		}		

		// Add jokers if requested
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
	 * Always call the hasNext() method before calling this method.
	 * This method should get the next card in the deck.
	 *
	 * Outcome
	 * =======
	 * The method will remove the next from the deck and return it in the method.
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
