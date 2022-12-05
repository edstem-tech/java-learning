package com.edstem.session2.daliya;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args){
         Card ace = new Card("A",1);
         Card two = new Card("2",2);
        Card three = new Card("3",3);
        Card four = new Card("4",4);
        Card five = new Card("5",5);
        Card six = new Card("6",6);
        Card seven = new Card("7",7);
        Card eight = new Card("8",8);
        Card nine = new Card("9",9);
        Card king = new Card("K",10);
        Card queen = new Card("Q",11);
        Card jack = new Card("J",12);

        Suit spade = new Suit(1,"Spade");
        spade.addCardItems(ace);
        spade.addCardItems(two);
        spade.addCardItems(three);
        spade.addCardItems(four);
        spade.addCardItems(five);
        spade.addCardItems(six);
        spade.addCardItems(seven);
        spade.addCardItems(eight);
        spade.addCardItems(nine);
        spade.addCardItems(king);
        spade.addCardItems(queen);
        spade.addCardItems(jack);

        Suit heart = new Suit(2,"Heart");
        heart.addCardItems(ace);
        heart.addCardItems(two);
        heart.addCardItems(three);
        heart.addCardItems(four);
        heart.addCardItems(five);
        heart.addCardItems(six);
        heart.addCardItems(seven);
        heart.addCardItems(eight);
        heart.addCardItems(nine);
        heart.addCardItems(king);
        heart.addCardItems(queen);
        heart.addCardItems(jack);

        Suit diamonds = new Suit(3,"Diamond");
        diamonds.addCardItems(ace);
        diamonds.addCardItems(two);
        diamonds.addCardItems(three);
        diamonds.addCardItems(four);
        diamonds.addCardItems(five);
        diamonds.addCardItems(six);
        diamonds.addCardItems(seven);
        diamonds.addCardItems(eight);
        diamonds.addCardItems(nine);
        diamonds.addCardItems(king);
        diamonds.addCardItems(queen);
        diamonds.addCardItems(jack);

        Suit clubs = new Suit(4,"Clubs");
        clubs.addCardItems(ace);
        clubs.addCardItems(two);
        clubs.addCardItems(three);
        clubs.addCardItems(four);
        clubs.addCardItems(five);
        clubs.addCardItems(six);
        clubs.addCardItems(seven);
        clubs.addCardItems(eight);
        clubs.addCardItems(nine);
        clubs.addCardItems(king);
        clubs.addCardItems(queen);
        clubs.addCardItems(jack);

        Deck deck = new Deck(new ArrayList<>());
        deck.addItems(clubs);
        deck.addItems(spade);
        deck.addItems(heart);
        deck.addItems(diamonds);

        System.out.println("************************");
        System.out.println("Available Cards");
        System.out.println("************************");
        deck.printCard();

        System.out.println("************************");
        System.out.println("After Shuffle");
        System.out.println("************************");
        deck.shuffleCardSuite();
        deck.printCard();

        System.out.println("************************");
        System.out.println("Random Card");
        System.out.println("************************");
        System.out.println(deck.getRandomSuit() + " : " + deck.getRandomCardNum());

        System.out.println("************************");
        System.out.println("After Sorting");
        System.out.println("************************");
        deck.sortSuitDeck();
        deck.printCard();
    }
}

//
//        A card can be represented using rank (A, 2-10, J, Q, K) and suit (spades, diamonds, clubs, hearts).
//        A deck (or frenchdeck) is a sequence of cards (52). Create two classes to implement a FrechDeck.
//
//        Implement the following functions.
//
//        Pick a random card from the deck
//        Shuffle all cards from the deck
//        Print a cardPrint a deck
//        Sort the cards in a deck -
//        A common system of ranking cards is by rank (with aces being highest),
//        then by suit in the order of spades (highest), hearts, diamonds, and clubs (lowest).
//        like 4
//        [Screenshot 2022-12-03 at 9.52.42 AM.png]
//
