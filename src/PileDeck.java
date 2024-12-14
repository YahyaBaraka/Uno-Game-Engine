import java.util.ArrayList;
import java.util.List;

public class PileDeck implements Deck{
    private List<Card> deck;

    public PileDeck() {
        deck = new ArrayList<>();
    }

    public int getSize() {
        return this.deck.size();
    }

    public void addCard(Card newCard) {
        this.deck.add(newCard);
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }


    public List<Card> getDeck() {
        return deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}
