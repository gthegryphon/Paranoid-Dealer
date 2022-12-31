package dev.chambers.entities;

public abstract class Card {
    private int cardID;
    private String cardText;
    private int actionOrder;
    private String imgLink;
    private CardType cardType;

    public Card(){}

    /*public Card(int cardID, CardType cardType, String cardText, int actionOrder, String imgLink, boolean isDrawn, boolean isPlayed) {
        //for action cards
        this.cardType = cardType;
        this.cardID = cardID;
        this.cardText = cardText;
        this.actionOrder = actionOrder;
        this.imgLink = imgLink;
        this.isDrawn = isDrawn;
        this.isPlayed = isPlayed;
    }*/
    public Card(int cardID, CardType cardType, String cardText, int actionOrder, String imgLink) {
        //for other cards
        this.cardType = cardType;
        this.cardID = cardID;
        this.cardText = cardText;
        this.actionOrder = actionOrder;
        this.imgLink = imgLink;

    }

    public int getCardID() {
        return cardID;
    }

    public void setCardID(int cardID) {
        this.cardID = cardID;
    }

    public String getCardText() {
        return cardText;
    }

    public void setCardText(String cardText) {
        this.cardText = cardText;
    }

    public int getActionOrder() {
        return actionOrder;
    }

    public void setActionOrder(int actionOrder) {
        this.actionOrder = actionOrder;
    }

    public String getImgLink() {
        return imgLink;
    }

    public void setImgLink(String imgLink) {
        this.imgLink = imgLink;
    }



    @Override
    public String toString() {
        return "Card{" +
                "cardID=" + cardID +
                ", cardText='" + cardText + '\'' +
                ", actionOrder=" + actionOrder +
                ", imgLink='" + imgLink + '\'' +
                ", cardType=" + cardType +
                '}';
    }
}
