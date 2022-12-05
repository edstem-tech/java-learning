package com.edstem.weekend_assignment_1_aravind;

import java.text.MessageFormat;

public class Card {
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

    @Override
    public String toString() {
        return MessageFormat.format("[{0}] {1} of {2}", this.getCardPosition(), this.rank, this.suite);
    }
}
