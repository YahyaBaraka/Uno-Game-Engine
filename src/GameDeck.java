import java.util.ArrayList;
import java.util.List;



public class GameDeck implements Deck {
    private List<Card> deck;

    public GameDeck() {
        deck = new ArrayList<>();
    }

    public int getSize() {
        return this.deck.size();
    }


    public List<Card> drawCards(int value) {
        if(value <= 0)
            throw new IllegalArgumentException("this value can't be drawn");

        if(value > this.getSize()) {
            swapWithDiscardedCards();
        }

        List<Card> list = new ArrayList<>();

        while (value != 0) {
            list.add(this.drawCard());
            value--;
        }
        return list;
    }

    public void swapWithDiscardedCards() {
        GamePileManager gamePileManager = GamePileManager.getInstance();

        while(this.isEmpty() == false) {
            drawCard();
        }

        this.deck = gamePileManager.getDiscardedCards().getDeck();
        gamePileManager.clearDiscardedCards();

        this.shuffle();
    }

    public Card drawCard() {
        if(this.isEmpty())
            throw new IllegalArgumentException("Deck is empty");

        Card card = deck.get(0);

        GamePileManager gamePileManager = GamePileManager.getInstance();
        gamePileManager.getDiscardedCards().addCard(card);

        deck.remove(0);

        return card;
    }


    public Card getCardAtTop() {
        return this.deck.get(0);
    }

    @Override
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


    @Override
    public boolean isEmpty() {
        return this.getSize() == 0;
    }


    @Override
    public void setDeck(List<Card> deck) {
        this.deck = deck;
    }
}