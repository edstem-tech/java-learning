package com.edstem.weekend_assignment_1_aravind;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {
    private final List<Card> cards;

    public Deck() {
        this.cards = new ArrayList<>();
        for (Card.Suite currentSuite : Card.Suite.values()) {
            for (Card.Rank currentRank : Card.Rank.values()) {
                Card currentCard = new Card(currentRank, currentSuite);
                this.cards.add(currentCard);
            }
        }
    }

    public void printDeck() {
        this.cards.forEach(card -> System.out.println(card.getCard()));
    }

    public String getRandomCardFromDeck() {
        int maxPosition = this.cards.toArray().length - 1;
        int minPosition = 0;
        int randomPosition = (int) ((Math.random() * (maxPosition - minPosition)) + minPosition);
        return this.cards.get(randomPosition).getCard();
    }

    public void shuffleDeck() {
        Collections.shuffle(this.cards);
    }

    public void sortDeck() {
        this.cards.sort((Card cardA, Card cardB) -> cardA.getCardPosition() - cardB.getCardPosition());
    }
}
