package com.olympic.cis143.m02.student.cards;


import java.util.Collections;
import java.util.Stack;

import com.olympic.cis143.m02.student.cards.Card.Suit;
import com.olympic.cis143.m02.student.cards.Card.Value;

public class Experiement {

	public static void main(String[] args) {

		Stack<Card> deck = new Stack<>();
		boolean jokers = true;

		// Create standard 52 card deck
		for (Suit suit : Suit.values()) {
			for (Value value : Value.values()) {
				if (suit != Suit.NONE && value != Value.JOKER) {
					Card card = new Card(suit, value);
					deck.push(card);
				}
			}
		}		
		// Add jokers if wanted
		if (jokers) {
			for (int i = 0; i <2; i++) {
				Card card = new Card(Suit.NONE, Value.JOKER);
				deck.push(card);
			}
		}
		
		Collections.shuffle(deck);

		// Empty the deck
		while (deck.size() != 0) {
			System.out.println(deck.pop());
		}
		
		// See if the exception works
		try {
			deck.pop();
		} catch (RuntimeException e) {
			throw new RuntimeException("Deck is empty.");
		}
		
		
	}
}
