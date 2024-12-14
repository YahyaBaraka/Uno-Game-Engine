public class NumberFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new NumberCard();
    }
}
