public class CardCustomiser {
    public int cardQuantity;
    public Colors cardColors;
    public Values cardValues;
    public Action cardAction;
    public CardFactory cardFactory;

    public CardCustomiser(int cardQuantity, Colors cardColors, Values cardValues, Action cardAction, CardFactory cardFactory) {
        this.cardQuantity = cardQuantity;
        this.cardColors = cardColors;
        this.cardValues = cardValues;
        this.cardAction = cardAction;
        this.cardFactory = cardFactory;
    }

    public int getCardQuantity() {
        return cardQuantity;
    }

    public Colors getCardColors() {
        return cardColors;
    }

    public Values getCardValues() {
        return cardValues;
    }

    public Action getCardAction() {
        return cardAction;
    }

    public CardFactory getCardFactory() {
        return cardFactory;
    }

    public void setCardQuantity(int cardQuantity) {
        this.cardQuantity = cardQuantity;
    }

    public void setCardColors(Colors cardColors) {
        this.cardColors = cardColors;
    }

    public void setCardValues(Values cardValues) {
        this.cardValues = cardValues;
    }

    public void setCardAction(Action cardAction) {
        this.cardAction = cardAction;
    }

    public void setCardFactory(CardFactory cardFactory) {
        this.cardFactory = cardFactory;
    }
}
