package com.olympic.cis143.m02.student.homework;

import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

import com.olympic.cis143.m02.student.homework.Card.Suit;
import com.olympic.cis143.m02.student.homework.Card.Value;

public class DeckLinkedListImpl {

    private Deque<Card> deck = new LinkedList<>();

    /**
     * Const.
     * @param jokers True if you want jokers in this deck.
     */
    public DeckLinkedListImpl(final boolean jokers) {
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
    				deck.addFirst(new Card(suit,value));
    			}
    		}
    	}
    	// Add jokers if requested
    	if (jokers) {
    		for (int i = 0; i < 2; i++) {
    			deck.addFirst(new Card(Suit.NONE, Value.JOKER));
    		}
    	}
    }

    /**
     * Gets the deck.
     * @return The deck.
     */
    public Deque<Card> getDeck() {
        return this.deck;
    }
    /**
     * Randomize and shuffle the deck of cards.
     */
    public void shuffle() {
    	Collections.shuffle((LinkedList<Card>) deck);       
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
			return deck.removeFirst();
		} catch (Exception e) {
			throw new RuntimeException("Deck is empty");
		}
    }
}
