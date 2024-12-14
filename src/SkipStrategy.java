public class SkipStrategy implements Action{
    @Override
    public void effect() {
        PlayersManager playersManager = PlayersManager.getInstance();
        TurnManager manager = TurnManager.getInstance();

        Player nxtPlayer = manager.getNextPlayer();
        Player nextToTheNextPlayer = playersManager.getNextTo(nxtPlayer);

        nxtPlayer.setPlayerIndex(nextToTheNextPlayer.getPlayerIndex());
        manager.setNextPlayer(nxtPlayer);
    }
    @Override
    public void printAction() {
        System.out.println("Skip");
    }
}
