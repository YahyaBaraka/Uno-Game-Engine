public class Draw2Factory implements CardFactory{
    @Override
    public Card createCard() {
        return new Draw2Card();
    }
}
