package com.boba.practiceproblems;

public class OGCard {

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

    public OGCard(final Suit suit, final Value value) {
        this.suit = suit;
        this.value = value;
    }

    public Suit getSuit() {
        return this.suit;
    }

    public Value getValue() {
        return value;
    }

    public boolean equals(final OGCard card) {
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



