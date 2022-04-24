package com.olympic.cis143.m02.student.cards;

import java.util.Stack;

public class DeckTest {

    public static void main(String[] args) throws Exception {
        DeckTest deckTest = new DeckTest();
        deckTest.testCreateJokersFalse();
        deckTest.testCreateJokersTrue();
        deckTest.testShuffle();
        deckTest.testGetCardDecrementsTheDeck();
        deckTest.testHasNext();
        deckTest.testHasNextThrowsExceptionOnEmptyNext();
    }

    public void testCreateJokersFalse() {
        Deck deck = new DeckImpl(false);
        if (deck.getDeck().size() != 52) {
            throw new RuntimeException(":) testCreateJokersFalseDeck Fail: Decks without Jokers should be 52 cards in total");
        }
        System.out.println(">> testCreateJokersFalseDeck passed.");
    }

    public void testCreateJokersTrue() {
        Deck deck = new DeckImpl(true);
        if (deck.getDeck().size() != 54) {
            throw new RuntimeException(":) testCreateJokersFalseDeck Fail: Decks without Jokers should be 54 cards in total");
        }
        System.out.println(">> testCreateJokersTrue passed.");
    }

    public void testShuffle() {
        Deck deck = new DeckImpl(true);
        Stack<Card> deckcp = (Stack<Card>) deck.getDeck().clone();
        deck.shuffle();
        if (deckcp.peek().equals(deck.getDeck().peek())) {
            throw new RuntimeException("): testShuffle Fail: deck after shuffle must be different.");
        }
        System.out.println(">> testShuffle passed.");
    }

    public void testGetCardDecrementsTheDeck() {
        Deck deck = new DeckImpl(true);
        deck.dealCard();
        if (deck.getDeck().size() != 53) {
            throw new RuntimeException("): testGetCardDecrementsTheDeck Fail: Deck did not decrement when getting the next card");
        }
        System.out.println(">> testGetCardDecrementsTheDeck passed.");
    }

    public void testHasNext() {
        Deck deck = new DeckImpl(true);
        while(deck.hasNext()) {
            deck.dealCard();
        }
        // If it is implemented it will pass through. If not an exception will be thrown.
        System.out.println(">> testHasNext passed.");
    }

    public void testHasNextThrowsExceptionOnEmptyNext() throws Exception{
        Deck deck = new DeckImpl(true);
        while(deck.hasNext()) {
            deck.dealCard();
        }
        try {
            deck.dealCard();
            throw new Exception("): testHasNextThrowsExceptionOnEmptyNext Fail: Should throw a runtime.");
        } catch (RuntimeException e) {
            System.out.println(">> testHasNextThrowsExceptionOnEmptyNext passed.");
        }
        // If it is implemented it will pass through. If not an exception will be thrown.

    }
}
