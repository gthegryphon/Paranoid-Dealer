package dev.chambers.entities;

public class Deck {
    private int sessionID;
    private String deckList;


    public String getDeckList (int sessionID){}

    public Deck(){}
    public Deck(int sessionID, String deckList){
        this.sessionID = sessionID;
        this.deckList= deckList;
    }

    //stretch
    //would track cards drawn/played during the session
}
