package dev.chambers.entities;

import java.util.ArrayList;

public class ActionCard extends Card {

    public ActionCard(){}
    //cardID 1-51 are action cards
    public ActionCard(int cardID, CardType cardType, String cardText, int actionOrder, String imgLink, boolean isDrawn, boolean isPlayed) {
        super(cardID, CardType.ACTION, cardText, actionOrder, imgLink, isDrawn, isPlayed);
    }



}
