public class ReverseFactory implements CardFactory{
    @Override
    public Card createCard() {
        return new ReverseCard();
    }
}
