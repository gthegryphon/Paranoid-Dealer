package dev.chambers.entities;

import dev.chambers.entities.Deck;
import dev.chambers.entities.Player;

public class Session {
    private ArrayList<Player> playerList;
    private Deck deck;

    public Session(){}
    public Session(ArrayList<Player> playerList, Deck deck){
        this.playerList=playerList;
        this.deck=deck;
    }

    public void setDeck(Deck deck){
        this.deck = deck;
    }
    public Deck getDeck(){
        return deck;
    }
    public void setPlayerList(ArrayList<Player> playerList){
        this.playerList=playerList;
    }
    public ArrayList<Player> getPlayerList(){
        return playerList;
    }

    @Override
    public String toString(){
        return "Session{"+
        "playerList="+playerList+
        ", deck="+deck+
        '}';
    }

}