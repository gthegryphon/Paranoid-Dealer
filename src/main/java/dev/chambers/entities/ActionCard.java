package dev.chambers.entities;

import java.util.ArrayList;

public class ActionCard extends Card {

    private boolean isDrawn;
    private boolean isPlayed;



    public boolean isDrawn() {
        return isDrawn;
    }

    public void setDrawn(boolean drawn) {
        isDrawn = drawn;
    }

    public boolean isPlayed() {
        return isPlayed;
    }


    public void setPlayed(boolean played) {
        isPlayed = played;
    }

    public ActionCard(){}
    //cardID 1-51 are action cards
    public ActionCard(int cardID, CardType cardType, String cardText, int actionOrder, String imgLink, boolean isDrawn, boolean isPlayed) {
        super(cardID, CardType.ACTION, cardText, actionOrder, imgLink);
        this.isDrawn = isDrawn;
        this.isPlayed = isPlayed;

    }

    @Override
    public String toString() {
        return "ActionCard{" +
                "isDrawn=" + isDrawn +
                ", isPlayed=" + isPlayed +
                ", cardID=" + getCardID() +
                ", cardText='" + getCardText() + '\'' +
                ", actionOrder=" + getActionOrder() +
                ", imgLink='" + getImgLink() + '\'' +
                ", cardType=ACTION" +
                '}';
    }
}
