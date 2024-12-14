public class SkipFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new SkipCard();
    }
}
