public class Draw2Strategy implements Action{
    public void effect() {
        TurnManager turnManager = TurnManager.getInstance();
        turnManager.getNextPlayer().setPunishValue(2);
        turnManager.getNextPlayer().setPunished(true);
    }
    @Override
    public void printAction() {
        System.out.println("Draw2");
    }
}
