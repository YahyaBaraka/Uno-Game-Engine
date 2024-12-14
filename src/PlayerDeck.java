import java.util.ArrayList;
import java.util.List;

public class PlayerDeck implements Deck{
    int size;
    public List<Card> deck;

    public PlayerDeck() {
        size = 0;
        deck = new ArrayList<>();
    }
    public Card getCardAt(int index) {
        if(index > this.getSize() || index <= 0)
            throw new RuntimeException("Index out of bounds");

        return this.deck.get(index - 1);
    }
    public void removeCardAt(int index) {
        deck.remove(index - 1);
    }
    public boolean isEmpty() {
        return (this.getSize() == 0);
    }
    public List<Card> getDeck() {
        return deck;
    }
    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
    public void addCard(Card newCard) {
        this.deck.add(newCard);
    }
    public int getSize() {
        return deck.size();
    }
}
