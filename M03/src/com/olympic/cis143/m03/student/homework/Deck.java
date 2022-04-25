package com.olympic.cis143.m03.student.homework;

import java.util.List;

public interface Deck {
    /**
     * Gets the deck.
     * @return The deck.
     */
    List<Card> getDeck();

    /**
     * Randomize and shuffle the deck of cards.
     */
    void shuffle();

    /**
     * True if the deck has cards remaining else false.
     * @return
     */
    boolean hasNext();

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
    Card dealCard();
}
