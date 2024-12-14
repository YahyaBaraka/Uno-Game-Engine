import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UnoGame {
    public void play() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Number Of Players");
        int n = scanner.nextInt();
        List<Player> players = new ArrayList<>();

        for(int i = 0 ; i < n ; i++) {
            Player player = new Player();
            player.setPlayerIndex(i + 1);
            System.out.println("Enter Player Name");

            String name = scanner.next();
            player.setName(name);

            players.add(player);
        }
        Initialize initializer = new Initialize();
        initializer.InitializePlayersDecks(players);

        PlayersManager playersManager = PlayersManager.getInstance();
        playersManager.setPlayers(players);

        GameDeck deck = new GameDeck();

        deck.setDeck(initializer.getInitializedDeck().getDeck());


        boolean goal = false;


        TurnManager turnManager = TurnManager.getInstance();
        turnManager.setCurrentPlayer(playersManager.getPlayerAt(1));
        turnManager.setNextPlayer(playersManager.getNextTo(turnManager.currentPlayer));

        NumberCard numberCard = new NumberCard();

        while(!deck.getCardAtTop().getClass().equals(numberCard.getClass())) {
            deck.shuffle();
        }

        Card currentCard = deck.drawCard();

        GamePileManager gamePileManager  = GamePileManager.getInstance();
        gamePileManager.setCurrentCard(currentCard);
        gamePileManager.setGameDeck(deck);

        GameIO gameIO = new GameIO();


        while(gameIO.goal == false) {
            gameIO.startOfRound();
        }
    }
}
