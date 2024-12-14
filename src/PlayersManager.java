import java.util.ArrayList;
import java.util.List;

public final class PlayersManager {
    private static PlayersManager instance;
    List<Player> players = new ArrayList<>();

    private PlayersManager() {

    }

    public static PlayersManager getInstance() {
        if (instance == null) {
            instance = new PlayersManager();
        }
        return instance;
    }

    public List<Player> getPlayers() {
        return players;
    }
    public void setPlayers(List<Player> players) {
        this.players = players;
    }
    public void addPlayer(Player player) {
        this.players.add(player);
    }
    public Player getPlayerAt(int index) {
        return players.get(index - 1);
    }
    public int getNumberOfPlayers() {
        return this.players.size();
    }
    public Player getNextTo(Player player) {
        int playerIndex = player.getPlayerIndex() - 1;

        TurnManager turnManager = TurnManager.getInstance();
        if(turnManager.isClockwise())
            return getPlayerAt(((playerIndex + 1) % this.getNumberOfPlayers()) + 1);

        else
            return getPlayerAt(((playerIndex - 1) % this.getNumberOfPlayers()) + 1);

    }

}