package dev.chambers.DAOs;

import dev.chambers.entities.Card;

import java.util.ArrayList;

public class EquipmentCardDAO implements CardDao{
    @Override
    public boolean deleteCard(int cardID) {
        return false;
    }

    @Override
    public boolean updateCard(Card card) {
        return false;
    }

    @Override
    public Card getCardByID(int cardID) {
        return null;
    }

    @Override
    public ArrayList<Card> getCards(int[] IDs) {
        return null;
    }
}
