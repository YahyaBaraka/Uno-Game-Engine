public class Draw4Factory implements CardFactory{
    @Override
    public Card createCard() {
        return new Draw4Card();
    }

    public Card createCard(String color, String value) {
        return new Draw4Card(color, value);
    }
}
