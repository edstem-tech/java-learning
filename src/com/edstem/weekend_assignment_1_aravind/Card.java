package com.edstem.weekend_assignment_1_aravind;

public class Card {
    public enum Rank {
        ACE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN,
        EIGHT,
        NINE,
        TEN,
        JACK,
        QUEEN,
        KING
    };

    public enum Suite {
        SPADES,
        HEARTS,
        DIAMONDS,
        CLUBS
    }

    private final Rank rank;
    private final Suite suite;

    public Card(Rank rank, Suite suite) {
        this.rank = rank;
        this.suite = suite;
    }

    public String getCard() {
        return this.rank + " of " + this.suite;
    }

    public int getCardPosition() {
        return (this.suite.ordinal() * Rank.values().length) +
                this.rank.ordinal() + 1;
    }

}
