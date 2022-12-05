package com.edstem.session2.Feba;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Deck {
    private final static ArrayList<Card> cards = new ArrayList<>();
    String[] suit = {"Clubs", "Diamonds", "Hearts", "Spades"};
    String[] rank = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    public void setDeck(){
        for (String s : suit) {
            for (String value : rank) {
                cards.add(new Card(s, value));
            }
        }
    }
//    public void setDeck(){
//        for (int i = 0; i < suit.length; i++) {
//            for(int j=0; j < rank.length; j++){
//                cards.add(new Card(suit[i], rank[j]));
//            }
//        }
//    }

    public ArrayList<Card> getDeck(){
        return cards;
    }

    //Shuffle all cards from the deck
    public void shuffleDeck() {
        Collections.shuffle(cards);
    }

    //Pick a random card from the deck
    public void getRandomCard() {
        Random rng = new Random();
        int randomNumber = rng.nextInt(cards.size());
        System.out.println(cards.get(randomNumber));
    }

    //Sort the cards in a deck
    public void sortDeck() {
        cards.sort((Card a, Card b) -> a.getRank() - b.getRank());
        cards.sort((Card a, Card b) -> a.getSuit() - b.getSuit());
    }

    public static void main(String[] args){
        Deck deck = new Deck();
        deck.setDeck();
        System.out.println("French Deck:");
        System.out.println(deck.getDeck());
        System.out.println("-----------------------------------");
        System.out.println("Shuffled French Deck:");
        deck.shuffleDeck();
        System.out.println(deck.getDeck());
        System.out.println("-----------------------------------");
        System.out.println("Random Card:");
        deck.getRandomCard();
        deck.sortDeck();
        System.out.println("-----------------------------------");
        System.out.println("Sorted Deck");
        System.out.println(deck.getDeck());
    }
}
