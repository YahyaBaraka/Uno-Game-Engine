import java.util.ArrayList;
import java.util.List;

public interface Deck {
    int getSize();
    void addCard(Card newCard);
    boolean isEmpty();
    void setDeck(List<Card> deck);
}
