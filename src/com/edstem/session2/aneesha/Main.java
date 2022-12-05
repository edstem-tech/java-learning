package com.edstem.session2.aneesha;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        Cards cards = new Cards();
        cards.getCard();
        myDeck deck = new myDeck(new ArrayList<>(), cards);
        deck.pickRandomCard();
        deck.shuffleDeck();
        deck.printDeck();
    }
}
