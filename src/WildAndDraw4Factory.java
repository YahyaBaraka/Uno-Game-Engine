public class WildAndDraw4Factory implements CardFactory{
    @Override
    public Card createCard() {
        return new WildAndDraw4Card();
    }
}
