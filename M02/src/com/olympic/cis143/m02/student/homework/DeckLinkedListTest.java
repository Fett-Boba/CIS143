package com.olympic.cis143.m02.student.homework;

import java.util.Arrays;
import java.util.List;

public class DeckLinkedListTest {

    public static void main(String[] args) throws Exception {
        DeckLinkedListTest deckTest = new DeckLinkedListTest();
        deckTest.testCreateJokersFalse();
        deckTest.testCreateJokersTrue();
        deckTest.testShuffle();
        deckTest.testGetCardDecrementsTheDeck();
        deckTest.testHasNext();
        deckTest.testHasNextThrowsExceptionOnEmptyNext();
    }

    public void testCreateJokersFalse() {
        DeckLinkedListImpl deck = new DeckLinkedListImpl(false);
        if (deck.getDeck().size() != 52) {
            throw new RuntimeException(":) testCreateJokersFalseDeck Fail: Decks without Jokers should be 52 cards in total");
        }
        System.out.println(">> testCreateJokersFalseDeck passed.");
    }

    public void testCreateJokersTrue() {
        DeckLinkedListImpl deck = new DeckLinkedListImpl(true);
        if (deck.getDeck().size() != 54) {
            throw new RuntimeException(":) testCreateJokersFalseDeck Fail: Decks without Jokers should be 54 cards in total");
        }
        System.out.println(">> testCreateJokersTrue passed.");
    }

    public void testShuffle() {
        DeckLinkedListImpl deck = new DeckLinkedListImpl(true);
        List deckcp = Arrays.asList(deck.getDeck().toArray());
        deck.shuffle();
        if (deckcp.equals(deck)) {
            throw new RuntimeException("): testShuffle Fail: deck after shuffle must be different.");
        }
        System.out.println(">> testShuffle passed.");
    }

    public void testGetCardDecrementsTheDeck() {
        DeckLinkedListImpl deck = new DeckLinkedListImpl(true);
        deck.dealCard();
        if (deck.getDeck().size() != 53) {
            throw new RuntimeException("): testGetCardDecrementsTheDeck Fail: Deck did not decrement when getting the next card");
        }
        System.out.println(">> testGetCardDecrementsTheDeck passed.");
    }

    public void testHasNext() {
        DeckLinkedListImpl deck = new DeckLinkedListImpl(true);
        while(deck.hasNext()) {
            deck.dealCard();
        }
        // If it is implemented it will pass through. If not an exception will be thrown.
        System.out.println(">> testHasNext passed.");
    }

    public void testHasNextThrowsExceptionOnEmptyNext() throws Exception{
        DeckLinkedListImpl deck = new DeckLinkedListImpl(true);
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
