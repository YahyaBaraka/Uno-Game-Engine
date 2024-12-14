import java.util.*;

public class Initialize {


    public Director director = new Director();
    public initializeDeck deck = new initializeDeck();


    public Initialize() {
        CardManagerBuilder builder = new CardManagerBuilder();
        director.constructDraw2Card(builder);
        addToDeck(builder);
        director.constructReverseCard(builder);
        addToDeck(builder);
        director.constructSkipCard(builder);
        addToDeck(builder);
        director.constructWildCard(builder);
        addToDeck(builder);
        director.constructNumberCard(builder);
        addToDeck(builder);
        director.constructZeroNumberCard(builder);
        addToDeck(builder);
        director.constructWildDraw4Card(builder);
        addToDeck(builder);

        deck.shuffle();
    }

    public void addToDeck(CardManagerBuilder builder) {
        List<String> colors = new ArrayList<>();
        colors = builder.getCardColors().getColors();
        int quantity = builder.getCardQuantity();

        for(int i = 0 ; i < quantity ; i++) {
            for(String color : colors) {
                for(String value : builder.getCardValues().getValues()) {
                    Card card = builder.getCardFactory().createCard();

                    card.setAction(builder.getCardAction());
                    card.setColor(color);
                    card.setValue(value);

                    deck.addCard(card);
                }
            }
        }
    }



    public void InitializePlayersDecks(List<Player> players) {
        if(players == null)
            throw new RuntimeException("null value");

        int initialCards = 7;
        if(initialCards * players.size() > deck.getSize())
            throw new RuntimeException("Not enough cards for players");

        int cnt = 0;
        for(int i = 0 ; i < players.size(); i++) {
            PlayerDeck tempDeck = new PlayerDeck();
            for(int j = 0; j < initialCards ; j++) {
                tempDeck.addCard(deck.getCardAt(cnt++ + 1));
            }
            players.get(i).setPlayerDeck(tempDeck);
        }

        int sz = initialCards*players.size();
        List<Card> temp = new ArrayList<>();

        for(int i = cnt + 1 ; i < deck.getSize() ; i++) {
            temp.add(deck.getCardAt(i + 1));
        }

        deck.setDeck(temp);
    }



    public initializeDeck getInitializedDeck() {
        return deck;
    }

}
