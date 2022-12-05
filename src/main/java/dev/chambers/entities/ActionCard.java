package dev.chambers.entities;

public class ActionCard extends Card {

    public ActionCard(int cardID, CardType cardType, String cardText, int actionOrder, String imgLink, boolean isDrawn, boolean isPlayed) {
        super(cardID, CardType.ACTION, cardText, actionOrder, imgLink, isDrawn, isPlayed);
    }
}
