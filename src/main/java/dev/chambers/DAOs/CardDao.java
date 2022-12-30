package dev.chambers.DAOs;

import dev.chambers.entities.Card;

import java.util.ArrayList;

public interface CardDao {
    //Card createCard(Card card);
    //manual card entry not really required
    boolean deleteCard(int cardID);
    boolean updateCard(Card card);

    boolean drawCard(int cardID);
    Card getCardByID(int cardID);

    ArrayList<Card> getCards(int[] IDs);
    //





}
