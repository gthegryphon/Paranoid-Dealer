package dev.chambers.entities;

public class MutantPower extends Card {

    public MutantPower(int cardID, CardType cardType, String cardText, int actionOrder, String imgLink, boolean isDrawn, boolean isPlayed) {
        super(cardID, CardType.MUTANT_POWER, cardText, actionOrder, imgLink, isDrawn, isPlayed);
    }
}
