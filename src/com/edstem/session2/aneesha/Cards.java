package com.edstem.session2.aneesha;

public class Cards {
    private final String[] Ranks;
    private final String[] Suits;
    private String  card;


    public Cards(){
        this.Ranks = new String[]{"Ace","2","3","4","5","6","7","8","9","10","Jack","Queen","King"};
        this.Suits = new String[]{"Spades", "Diamonds", "Clubs", "Hearts"};
    }

    public String[] getRanks(){
        return this.Ranks;
    };

    public String[] getSuits(){
        return this.Suits;
    };

    public void getCard(){
        for(int i = 0; i < this.getRanks().length; i++) {
            for(int j = 0; j < this.getSuits().length; j++) {
                String card = this.getRanks()[i] + " of " + this.getSuits()[j];
                System.out.println(card);

            }
        }
    }
}