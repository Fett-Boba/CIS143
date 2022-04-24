package com.olympic.cis143.m02.student.cards;

import java.util.Collections;
import java.util.Stack;

import com.olympic.cis143.m02.student.cards.Card.Suit;
import com.olympic.cis143.m02.student.cards.Card.Value;

public class  DeckImpl implements Deck  {

    private Stack<Card> deck = new Stack<>();
   
    // jokers True if you want jokers in this deck
    public DeckImpl(final boolean jokers) {
        this.createDeck(jokers);
    }

    // jokers True if you want jokers added to the deck.
    private void createDeck(final boolean jokers) {
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				if (suit != Suit.NONE && value != Value.JOKER) {
					Card card = new Card(suit, value);
					deck.push(card);
				}
			}
		}		
		if (jokers) {
			for (int i = 0; i <2; i++) {
				Card card = new Card(Suit.NONE, Value.JOKER);
				deck.push(card);
			}
		}
    }

    // returns the deck
    @Override
	public Stack<Card> getDeck() {
        return deck ;
    }
        
    // randomize and shuffle the deck of cards.
    @Override
	public void shuffle() {
    	Collections.shuffle(deck);
    }

    
    //return True if the deck has cards remaining else false.
    @Override
	public boolean hasNext() {
    	return deck.isEmpty() ? false : true;
    }

    /* Always call the hasNext() method before calling this method.
     This method should get the next card in the deck.
     If the deck is empty it should through a RuntimeException.
     */
    @Override
	public Card dealCard() {
		try {
			return deck.pop();
		} catch (RuntimeException e) {
			throw new RuntimeException("Deck is empty.");
		}
    }
}
