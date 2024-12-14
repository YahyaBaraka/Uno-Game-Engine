public class ReverseCardStrategy implements Action{
    @Override
    public void effect() {

        PlayersManager playersManager = PlayersManager.getInstance();

        TurnManager manager = TurnManager.getInstance();

        if(playersManager.getNumberOfPlayers() == 2) {
            Player nxtPlayer = new Player();

            nxtPlayer.setPlayerIndex(playersManager.getNextTo(manager.getNextPlayer()).getPlayerIndex());
            manager.setNextPlayer(nxtPlayer);

            return;
        }

        manager.setClockwise(!manager.isClockwise());
        manager.setNextPlayer(playersManager.getNextTo(manager.getCurrentPlayer()));
    }
    @Override
    public void printAction() {
        System.out.println("Reverse");
    }
}
