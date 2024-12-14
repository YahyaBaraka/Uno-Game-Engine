public interface Builder {
    public int getCardQuantity();

    public Colors getCardColors();

    public Values getCardValues();

    public Action getCardAction();

    public CardFactory getCardFactory();

    public void setCardQuantity(int cardQuantity);

    public void setCardColors(Colors cardColors);

     void setCardValues(Values cardValues);

    public void setCardAction(Action cardAction);

    public void setCardFactory(CardFactory cardFactory);
    public CardCustomiser getResult();
}
