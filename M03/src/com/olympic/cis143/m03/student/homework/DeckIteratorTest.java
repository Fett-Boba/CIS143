package com.olympic.cis143.m03.student.homework;

import java.util.Arrays;
import java.util.List;

public class DeckIteratorTest {

    
    public static void main(String[] args) throws Exception {
        DeckIteratorTest deckTest = new DeckIteratorTest();
        deckTest.testCreateJokersFalse();
        deckTest.testCreateJokersTrue();
        deckTest.testShuffle();
        deckTest.testHasNext();
        deckTest.testHasNextThrowsExceptionOnEmptyNext();
    }

    public void testCreateJokersFalse() {
        Deck deck = new DeckIteratorImpl(false);
        if (deck.getDeck().size() != 52) {
            throw new RuntimeException(":) testCreateJokersFalseDeck Fail: Decks without Jokers should be 52 cards in total");
        }
        System.out.println(">> testCreateJokersFalseDeck passed.");
    }

    public void testCreateJokersTrue() {
        Deck deck = new DeckIteratorImpl(true);
        if (deck.getDeck().size() != 54) {
            throw new RuntimeException(":) testCreateJokersFalseDeck Fail: Decks without Jokers should be 54 cards in total");
        }
        System.out.println(">> testCreateJokersTrue passed.");
    }

    public void testShuffle() {
        Deck deck = new DeckIteratorImpl(true);
        List deckcp = Arrays.asList(deck.getDeck().toArray());
        deck.shuffle();
        if (deckcp.equals(deck)) {
            throw new RuntimeException("): testShuffle Fail: deck after shuffle must be different.");
        }
        System.out.println(">> testShuffle passed.");
    }

    public void testHasNext() {
        Deck deck = new DeckIteratorImpl(true);
        deck.shuffle();
        while(deck.hasNext()) {
            deck.dealCard();
        }
        // If it is implemented it will pass through. If not an exception will be thrown.
        System.out.println(">> testHasNext passed.");
    }

    public void testHasNextThrowsExceptionOnEmptyNext() throws Exception{
        Deck deck = new DeckIteratorImpl(true);
        deck.shuffle();
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
