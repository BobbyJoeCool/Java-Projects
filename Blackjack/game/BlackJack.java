package game;

import actor.Dealer;
import actor.Player;
import java.util.Scanner;
import model.Deck;
import model.GameResult;

/**
 * Represents a console-based Blackjack game.
 * This class manages the game flow, including dealing cards, player turns, dealer turns, and determining winners.
 */
public class BlackJack {

    final private Deck deck;
    final private Dealer dealer;
    final private Player player;
    final private Scanner input;

    /**
     * Private constructor for creating a game with a default player name.
     */
    private BlackJack() {
        this.deck = new Deck();
        this.player = new Player("Player");
        this.dealer = new Dealer();
        this.input = new Scanner(System.in);
    }

    /**
     * Private constructor for creating a game with a specified player name.
     * @param playerName the name of the player
     */
    private BlackJack(String playerName) {
        this.deck = new Deck();
        this.player = new Player(playerName);
        this.dealer = new Dealer();
        this.input = new Scanner(System.in);
    }

    /**
     * Starts a new round by clearing hands and shuffling the deck.
     */
    private void startRound() {
        player.clearHand();
        dealer.clearHand();

        deck.shuffle();
    }

    /**
     * Deals the initial two cards to both player and dealer.
     */
    private void dealInitialCards() {
        player.recieveCard(deck.removeCard());
        dealer.recieveCard(deck.removeCard());
        player.recieveCard(deck.removeCard());
        dealer.recieveCard(deck.removeCard());
    }

    /**
     * Handles the player's turn, allowing them to hit or stand until they stand or bust.
     */
    private void playerTurn() {
        boolean playerPass = false;
        String hitOrStand;
        while (!playerPass) {
            System.out.println("\n" + dealer.getDealerHand());
            System.out.println(player.toString());
            System.out.print("Would you like to hit or stand? ");
            hitOrStand = input.nextLine().toLowerCase().trim();
            if (hitOrStand.equals("stand")) {
                playerPass = true;
            } else if (hitOrStand.equals("hit")) {
                player.recieveCard(deck.removeCard());
                if (player.isBust()) {
                    playerPass = true;
                }
            } else {
                System.out.println("Invalid Input, try again.");
            }
            System.out.println();
        }
    }

    /**
     * Handles the dealer's turn, hitting until the hand value is 17 or higher.
     */
    private void dealerTurn() {
        boolean dealerUnder17 = (dealer.getHandValue() < 17);
        System.out.println(player.toString());
        System.out.println(dealer.toString());
        while (dealerUnder17) {
            dealer.recieveCard(deck.removeCard());
            System.out.println(dealer.toString());
            dealerUnder17 = dealer.getHandValue() < 17;
        }
    }

    /**
     * Determines the winner of the round based on hand values and bust conditions.
     * @return the game result indicating who won or if it's a push
     */
    private GameResult determineWinner() {

        if (player.isBust()) {
            return GameResult.DEALER_WINS;
        }
        if (dealer.isBust()) {
            return GameResult.PLAYER_WINS;
        }

        if (player.getHandValue() > dealer.getHandValue()) {
            return GameResult.PLAYER_WINS;
        }
        if (player.getHandValue() < dealer.getHandValue()) {
            return GameResult.DEALER_WINS;
        }

        return GameResult.PUSH;
    }

    /**
     * Displays the final results of the round to the console.
     * @param result the game result to display
     */
    private void displayResult(GameResult result) {

        String winner = switch (result) {
            case PLAYER_WINS ->
                player.getName() + " wins!";
            case DEALER_WINS ->
                dealer.getName() + " wins!";
            case PUSH ->
                "It's a push!";
        };

        System.out.println("\nFinal Results:");
        System.out.println(dealer.toString());
        System.out.println(player.toString());
        System.out.println(winner);
    }

    /**
     * Runs the main game loop, allowing multiple rounds until the player chooses to stop.
     */
    private void runGameLoop() {
        boolean playing = true;
        while (playing) {
            startRound();
            dealInitialCards();
            playerTurn();
            if (!player.isBust()) {
                dealerTurn();
            }
            displayResult(determineWinner());
            System.out.print("Would you like to play again? ");
            String again = input.nextLine().toLowerCase().trim();
            if (again.isEmpty() || again.charAt(0) != 'y') {
                playing = false;
            }
        }
    }

    /**
     * The main method to start the Blackjack game.
     * Prompts for player name and begins the game loop.
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Blackjack!");
        System.out.println("Programmed by Robert J Breutzmann.");
        System.out.println("Version 1.0");
        System.out.println("----------------------------------");

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        BlackJack game = new BlackJack(name);
        game.runGameLoop();

        System.out.println("Thanks for Playing!");
        input.close();
    }
}
