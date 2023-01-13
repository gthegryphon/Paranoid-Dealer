package dev.chambers.services;

public class SessionService {
    //card IDs between 1-51 are Actions
    public void dealCards(){
        for (Player p : playerList){
            int cardID = Math.random()*51;
            deck.drawCard(cardID);
            if(cardID<10){
                String card = "0"+String.valueOf(cardID);
            }else{
                String card = String.valueOf(cardID);
            }
            p.setHand(p.hand+=card);

        }
    }

}
