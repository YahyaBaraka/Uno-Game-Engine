import java.util.List;

public class Player {
    private String name;
    private PlayerDeck playerDeck;
    private int playerIndex;
    private boolean punished;
    private int punishValue;

    public Player() {
        this.playerDeck = new PlayerDeck();
        this.punished = false;
        this.punishValue = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlayerDeck getPlayerDeck() {
        return playerDeck;
    }

    public void setPlayerDeck(PlayerDeck playerDeck) {
        this.playerDeck.setDeck(playerDeck.getDeck());
    }

    public int getPlayerIndex() {
        return playerIndex;
    }

    public void setPlayerIndex(int playerIndex) {
        this.playerIndex = playerIndex;
    }

    public boolean isPunished() {
        return punished;
    }

    public void setPunished(boolean punished) {
        this.punished = punished;
    }

    public int getPunishValue() {
        return punishValue;
    }

    public void setPunishValue(int punishValue) {
        this.punishValue = punishValue;
    }

    public void drawPunishedCards() {
        GamePileManager gamePileManager = GamePileManager.getInstance();

        List<Card> drawnCards = gamePileManager.getGameDeck().drawCards(this.getPunishValue());

        for(int i = 0 ; i < drawnCards.size() ; i++)
            this.getPlayerDeck().addCard(drawnCards.get(i));
    }

    public void drawCardFromDeck() {
        GamePileManager gamePileManager = GamePileManager.getInstance();

        Card drawnCard = gamePileManager.gameDeck.drawCard();
        this.playerDeck.addCard(drawnCard);
    }
}
