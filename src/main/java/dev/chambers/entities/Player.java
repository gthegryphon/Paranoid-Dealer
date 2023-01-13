package dev.chambers.entities;

import java.util.ArrayList;

public class Player{
    private int playerID;
    private ArrayList<Integer> hand;
    private String characterName;
    
    public Player(){}
    public Player(int playerID, ArrayList<Integer> hand, String characterName){
        this.playerID=playerID;
        this.hand = hand;
        this.characterName = characterName;
    }
    public Player(ArrayList<Integer> hand, String characterName){
        this.hand=hand;
        this.hand = new ArrayList();
        //only doesn't need player ID if a new player, who doesn't yet have hand
    }
    public void setHand(ArrayList<Integer> newHand){
        this.hand = newHand;
    }
    public ArrayList<Integer> getHand(){
        return hand;
    }
    public void setPlayerID(int id){
        this.playerID = id;
    }
    public int getPlayerID(){
        return playerID;
    }
    public void setCharacterName(String name){
        this.characterName = name;
    }
    public String getCharacterName(){
        return characterName;
    }

    @Override
    public String toString(){
        return "Player{"+
        "playerID="+playerID+
        ", hand="+hand+
        ", characterName='"+characterName+'\''+
        '}';
    }

    public String convertHand(ArrayList<Integer> hand){
        String handString = "";
        for (Integer i : hand){
            if(i<10){
                handString+="0";
                handString+=String.valueOf(i);
            }else{
                handString+=String.valueOf(i);
            }
        }
        return handString;
    }
    public ArrayList<Integer> convertHand(String hand){
        ArrayList<Integer> handList = new ArrayList();
        for (int i = 0; i<hand.length(); i+=2){
            handList.add(Integer.parseInt(hand.substring(i,i+2)));
        }
        return handList;
    }
}