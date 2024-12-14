public class Draw4Strategy implements Action{
    @Override
    public void effect() {
        TurnManager turnManager = TurnManager.getInstance();
        turnManager.getNextPlayer().setPunishValue(4);
        turnManager.getNextPlayer().setPunished(true);
    }
    @Override
    public void printAction() {
        System.out.println("Draw2");
    }
}
