import java.util.Scanner;

public class GameIO {

    public boolean goal = false;
    public void startOfRound() {

        System.out.println("***\nStart of a new turn !\n***\n");

        PlayersManager playersManager = PlayersManager.getInstance();
        TurnManager turnManager = TurnManager.getInstance();
        GamePileManager gamePileManager = GamePileManager.getInstance();

        printCurrentPlayer();
        printCurrentCard();

        if(turnManager.getCurrentPlayer().isPunished()) {
            currentPlayerIsPunishedInteraction();
            return;
        }

        turnManager.getCurrentPlayer().setPunished(false);
        turnManager.getCurrentPlayer().setPunishValue(0);

        choosingCardInteraction();
    }
    public void currentPlayerIsPunishedInteraction() {

        PlayersManager playersManager = PlayersManager.getInstance();
        TurnManager turnManager = TurnManager.getInstance();
        GamePileManager gamePileManager = GamePileManager.getInstance();


        System.out.println("Current Player is Punished !!");
        System.out.println(turnManager.getCurrentPlayer().getName() + " Must draw " + turnManager.getCurrentPlayer().getPunishValue() + " Cards");

        turnManager.getCurrentPlayer().drawPunishedCards();

        System.out.println(turnManager.getCurrentPlayer().getName() + " Drawn the punished value of cards !!");

        nextRoundInteraction();
    }

    public void printCurrentCard() {

        TurnManager turnManager = TurnManager.getInstance();
        GamePileManager gamePileManager = GamePileManager.getInstance();

        System.out.println("Last card played color is " + gamePileManager.currentCard.getColor() + '\n' +
                "Last card played value is " + gamePileManager.currentCard.getValue());
    }

    public void printCurrentPlayer() {
        TurnManager turnManager = TurnManager.getInstance();
        System.out.println("****\nCurrent Player is " + turnManager.getCurrentPlayer().getName() + "\n****");
    }

    public void choosingCardInteraction() {

        System.out.println("\n *** The system is talking to you *** \n ");


        int number = 0;
        Scanner scanner = new Scanner(System.in);
        while(number != 2) {
            System.out.println("\n*******\nEnter 1 if you want to view your cards\n" + "Enter 2 if you want to choose a card to play \n" +
                    "Enter 3 if you want to view current card\n" +
                    "Enter 4 if you want to draw a card\n*******\n");

            number = scanner.nextInt();
            if(number == 1)
                this.printCurrentPlayerCards();
            else if(number == 2)
                break;
            else if(number == 3)
                printCurrentCard();
            else if(number == 4) {
                drawCardInteraction();
                nextRoundInteraction();
                return;
            }
            else
                System.out.println("Input not valid !");
        }

        TurnManager turnManager = TurnManager.getInstance();
        GamePileManager gamePileManager = GamePileManager.getInstance();
        Card playedCard;

        while (true) {
            System.out.println("Enter the number of the card you want to play");

            number = scanner.nextInt();
            Card card = turnManager.getCurrentPlayer().getPlayerDeck().getCardAt(number);


            if(gamePileManager.getCurrentCard().isStackable(card))
                break;
            else
                System.out.println("Not a valid Card \n" + " please choose another one");
        }

        playedCard = turnManager.getCurrentPlayer().getPlayerDeck().getCardAt(number);
        turnManager.getCurrentPlayer().getPlayerDeck().removeCardAt(number);

        goal = turnManager.getCurrentPlayer().getPlayerDeck().isEmpty();

        if(!goal)
            chosenCardInteraction(playedCard);
        else
            printWinner();
    }
    public void printWinner() {
        TurnManager turnManager = TurnManager.getInstance();
        System.out.println("The winner is " + turnManager.getCurrentPlayer().getName());
    }

    public void chosenCardInteraction(Card playedCard) {
        TurnManager turnManager = TurnManager.getInstance();
        GamePileManager gamePileManager = GamePileManager.getInstance();
        gamePileManager.setCurrentCard(playedCard);


        playedCard.getAction().effect();
        printChosenCardAction(playedCard);
        nextRoundInteraction();
    }

    public void printChosenCardAction(Card playedCard) {
        TurnManager turnManager = TurnManager.getInstance();

        System.out.print("***\n" + turnManager.getCurrentPlayer().getName() +" Played a card with value "+ playedCard.getValue()
        + " and color "+ playedCard.getColor() + "\n");


        playedCard.getAction().printAction();
    }

    public void drawCardInteraction() {
        TurnManager turnManager = TurnManager.getInstance();
        System.out.println("***\n"+  turnManager.getCurrentPlayer().getName() + " drawn a card !\n***\n");


        turnManager.getCurrentPlayer().drawCardFromDeck();
    }

    public void nextRoundInteraction() {

        TurnManager turnManager = TurnManager.getInstance();
        PlayersManager playersManager = PlayersManager.getInstance();


        Player nxtPlayer = turnManager.getNextPlayer();
        turnManager.setCurrentPlayer(nxtPlayer);
        turnManager.setNextPlayer(playersManager.getNextTo(nxtPlayer));
    }

    public void printCurrentPlayerCards() {
        TurnManager turnManager = TurnManager.getInstance();
        PlayerDeck playerHand = turnManager.getCurrentPlayer().getPlayerDeck();

        for(int i = 0 ; i < playerHand.getSize() ; i++) {
            Card card = playerHand.getCardAt(i + 1);

            System.out.print("Card number " + (i + 1) + " color is " + card.getColor() +
                     " and value is " + card.getValue()+"\n");
        }
    }
}
