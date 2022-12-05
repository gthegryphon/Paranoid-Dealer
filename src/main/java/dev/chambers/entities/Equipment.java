package dev.chambers.entities;

public class Equipment extends Card{
    public Equipment(int cardID, CardType cardType, String cardText, int actionOrder, String imgLink, boolean isDrawn, boolean isPlayed) {
        super(cardID, CardType.EQUIPMENT, cardText, actionOrder, imgLink, isDrawn, isPlayed);
    }
}
