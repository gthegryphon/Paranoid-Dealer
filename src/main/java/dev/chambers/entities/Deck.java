package dev.chambers.entities;

public class Deck {
    private int sessionID;
    private String deckList;


    public String getDeckList(){
        return deckList;
    }
    public void setDeckList(String deckList){
        this.deckList=deckList;
    }
    public int getSessionID(){
        return sessionID;
    }
    public void setSessionID(int sessionID){
        this.sessionID=sessionID;
    }

    public Deck(){}
    public Deck(int sessionID, String deckList){
        this.sessionID = sessionID;
        this.deckList= deckList;
    }
    public void drawCard(int cardID){
        StringBuilder str = new StringBuilder(deckList);
        str.setCharAt(cardID-1, '1');
        deckList = str;
    }
    @Override
    public String toString(){
        return "Deck{"+
        "sessionID="+sessionID+
        ", deckList='"+deckList+'\''+
        '}';
    }

    //stretch
    //would track cards drawn/played during the session
}
