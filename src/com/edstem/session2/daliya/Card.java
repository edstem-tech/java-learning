package com.edstem.session2.daliya;

public class Card {
    private String name;
    private int rank;

    public Card(String name, int rank){
        this.name = name;
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return name;
    }
}
