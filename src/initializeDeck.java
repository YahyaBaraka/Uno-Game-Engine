import java.util.ArrayList;
import java.util.List;

public class initializeDeck implements Deck{
    private List<Card> deck;

    public initializeDeck() {
        deck = new ArrayList<>();
    }

    public int getSize() {
        return this.deck.size();
    }



    public void addCard(Card newCard) {
        this.deck.add(newCard);
    }

    public void shuffle() {
        int n = this.getSize();

        for (int i = 0; i < n; i++) {
            int r = (int) (Math.random() * (i + 1));
            Card swap = this.deck.get(r);

            this.deck.set(r, this.deck.get(i));
            this.deck.set(i, swap);
        }
    }

    public Card getCardAt(int index) {
        if(index > this.getSize() || index <= 0)
            throw new RuntimeException("Index out of bounds");

        return this.deck.get(index - 1);
    }

    public boolean isEmpty() {
        return this.getSize() == 0;
    }


    public List<Card> getDeck() {
        return this.deck;
    }

    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }

}
