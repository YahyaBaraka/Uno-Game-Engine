import java.util.Scanner;

public class WildStrategy implements Action{
    @Override
    public void effect() {
        String color;
        System.out.println("Please enter one of the following colors");
        System.out.println("Blue Green Red Yellow");
        Scanner scanner = new Scanner(System.in);

        String chosenColor = scanner.nextLine();
        GamePileManager gamePileManager = GamePileManager.getInstance();

        while (!isValid(chosenColor)) {
            System.out.println("Please choose one of the displayed colors");
            scanner.nextLine();
            chosenColor = scanner.nextLine();
        }
        gamePileManager.currentCard.setColor(chosenColor);
    }
    public boolean isValid(String s) {
        if(s.equalsIgnoreCase("Blue") || s.equalsIgnoreCase("Red") ||
        s.equalsIgnoreCase("Green") || s.equalsIgnoreCase("Yellow"))
            return true;
        return false;
    }
    @Override
    public void printAction() {
        System.out.println("Wild");
    }
}
