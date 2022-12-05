package com.edstem.session2.daliya;
import java.util.ArrayList;
import java.util.List;

public class Suit {
    private int rank;
    private String suitName;
    private List<Card> suitItems = new ArrayList<>();

  public Suit(int rank, String suitName){
      this.rank = rank;
      this.suitName = suitName;
  }

    public void addCardItems(Card card){
        this.suitItems.add(card);
    }

    public List<Card> getSuitItems() {
        return suitItems;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return suitName  + " : " + suitItems;
    }
}
