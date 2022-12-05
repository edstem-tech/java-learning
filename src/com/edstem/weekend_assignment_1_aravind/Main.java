package com.edstem.weekend_assignment_1_aravind;

public class Main {
    public static void main(String[] args) {
        Deck myDeck = new Deck();
        // TODO: 1. Pick a random card from the deck
        System.out.println("1. Picking Random Card : ");
        System.out.println(myDeck.getRandomCardFromDeck());
        System.out.println("\n------------------------------------------------------\n");
        // TODO: 2. Print the full deck
        System.out.println("2. Full deck : ");
        myDeck.printDeck();
        System.out.println("\n------------------------------------------------------\n");
        // TODO: 3. Shuffle the full deck
        System.out.println("3. Shuffled Deck : ");
        myDeck.shuffleDeck();
        myDeck.printDeck();
        System.out.println("\n------------------------------------------------------\n");
        // TODO: 4. Sort the full deck according to rank
        System.out.println("4. Sorted Deck : ");
        myDeck.sortDeck();
        myDeck.printDeck();
    }
}
