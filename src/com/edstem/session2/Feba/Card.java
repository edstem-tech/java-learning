package com.edstem.session2.Feba;

public class Card {
    private final String suit;
    private final String rank;

    public Card(String suit, String rank) {
        this.suit = suit;
        this.rank = rank;
    }

    public Integer getSuit() {
        switch (suit) {
            case "Spades":
                return 1;
            case "Diamonds":
                return 2;
            case "Hearts":
                return 3;
            default:
                return 4;
        }
    }

    public Integer getRank() {
        switch (rank) {
            case "Ace":
                return 1;
            case "Jack":
                return 11;
            case "Queen":
                return 12;
            case "King":
                return 13;
            default:
                return Integer.valueOf(rank);
        }

    }

    public String toString(){
        return "\n"+ rank + " of "+ suit;
    }

}
