public class WildFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new WildCard();
    }
}
