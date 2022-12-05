package com.edstem.session2.daliya;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
    private List<Suit> cardDeck;

    public Deck(List<Suit> suit){
        this.cardDeck = suit;
    }

    public void addItems(Suit suit){
        this.cardDeck.add(suit);
    }

    public void printCard(){
        for(Suit suit: this.cardDeck){
            System.out.println(suit);
        }
    }

    public void shuffleCardSuite(){
        Random random = new Random();
        Collections.shuffle(this.cardDeck, new Random(random.nextInt(this.cardDeck.size())));
        shuffleCard();
    }

    public void shuffleCard(){
        for(int i=0;i<this.cardDeck.size();i++){
            Random random = new Random();
            int randomNumber = random.nextInt(this.cardDeck.get(i).getSuitItems().size());
            Collections.shuffle(this.cardDeck.get(i).getSuitItems(), new Random(randomNumber));
        }
    }

    public void sortSuitDeck(){
        this.cardDeck.sort((Suit a, Suit b) -> a.getRank() -  b.getRank());
        sortCard();
    }

    public void sortCard(){
        for(int i=0;i<this.cardDeck.size();i++){
            this.cardDeck.get(i).getSuitItems().sort((Card a, Card b) -> a.getRank() - b.getRank());
        }
    }

    public String getRandomCardNum(){
        Random random = new Random();
        String cardRank;
        int r = 1 + random.nextInt(13);
        switch (r) {
            case 1:
                cardRank = "A";
                break;
            case 2:
                cardRank = "2";
                break;
            case 3:
                cardRank = "3";
                break;
            case 4:
                cardRank = "4";
                break;
            case 5:
                cardRank = "5";
                break;
            case 6:
                cardRank = "6";
                break;
            case 7:
                cardRank = "7";
                break;
            case 8:
                cardRank = "8";
                break;
            case 9:
                cardRank = "9";
                break;
            case 10:
                cardRank = "K";
                break;
            case 11:
                cardRank = "Q";
                break;
            default:
                cardRank = "J";
                break;
        }
        return cardRank;
    }

    public String getRandomSuit(){
        Random random = new Random();
        String suitRank;
        int r = 1 + random.nextInt(4);
        switch (r){
            case 1:
                suitRank = "Spade";
                break;
            case 2:
                suitRank = "Heart";
                break;
            case 3:
                suitRank = "Diamonds";
                break;
            default:
                suitRank = "Clubs";
                break;
        }
        return suitRank;
    }

}
