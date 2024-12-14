import java.util.ArrayList;
import java.util.List;

public final class GamePileManager {
    private static GamePileManager instance;
    public Card currentCard;
    public PileDeck discardedCards;

    public GameDeck gameDeck;

    boolean goal;

    private GamePileManager() {
        goal = false;
        gameDeck = new GameDeck();
        discardedCards = new PileDeck();
    }

    public static GamePileManager getInstance() {
        if (instance == null) {
            instance = new GamePileManager();
        }
        return instance;
    }

    public boolean goalIsDone() {
        return goal;
    }

    public GameDeck getGameDeck() {
        return gameDeck;
    }

    public void setGameDeck(GameDeck gameDeck) {
        this.gameDeck = gameDeck;
    }

    public Card getCurrentCard() {
        return currentCard;
    }

    public void setCurrentCard(Card currentCard) {
        this.currentCard = currentCard;
    }

    public PileDeck getDiscardedCards() {
        return discardedCards;
    }

    public void setDiscardedCards(PileDeck discardedCards) {
        this.discardedCards = discardedCards;
    }
    public void clearDiscardedCards() {
        getDiscardedCards().getDeck().clear();
    }
}