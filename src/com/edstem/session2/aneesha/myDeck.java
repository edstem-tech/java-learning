package com.edstem.session2.aneesha;

import java.util.List;
import java.util.Random;

public class myDeck {

    private final List<String> deck;

    public myDeck(List<String> deck, Cards card) {
        this.deck = deck;
        for(int i = 0; i < card.getRanks().length; i++) {
            for(int j = 0; j < card.getSuits().length; j++) {
                deck.add(card.getRanks()[i] + " of " + card.getSuits()[j]);
            }
        }

    }

    public void pickRandomCard(){
        Random random=new Random();
        int randomNumber=random.nextInt(this.deck.size());
        System.out.println(this.deck.get(randomNumber));
    }

    public void shuffleDeck() {
        for (int i = 0; i < this.deck.size(); i++) {
            int index = (int) (Math.random() * this.deck.size());
            String temp = this.deck.get(i);
            this.deck.set(i, this.deck.get(index));
            this.deck.set(index, temp);
        }
    }

    public void printDeck(){
        System.out.println(this.deck);
    }
}
