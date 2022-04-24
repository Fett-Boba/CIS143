package com.olympic.cis143.m02.student.homework;

/**
 * Class to hold information about the Card. Cards are held in decks and have a Suit and value.
 *
 * Note that jokers are created with a suit of NONE. Note that, other than joker cards, NONE should not ever be a suit.
 */
public class Card {

    enum Suit {
        HEARTS,
        CLUBS,
        DIAMONDS,
        SPADES,
        NONE
    }

    enum Value {
        JOKER,
        ACE,
        KING,
        QUEEN,
        JACK,
        _10,
        _9,
        _8,
        _7,
        _6,
        _5,
        _4,
        _3,
        _2
    }

    private Suit suit;

    private Value value;

    /**
     * Const.
     *
     * @param suit The SUITE of the card
     * @param value The VALUE of the card.
     */
    public Card(final Suit suit, final Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return value;
    }

    public boolean equals(final Card card) {
        if (card.value == this.value && card.suit == this.suit) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "[ Suit: " + this.suit + ", Value: " + value + " ]";
    }
}
