package game;

import actor.Dealer;
import actor.Player;
import java.util.Scanner;
import model.Deck;
import model.GameResult;

public class BlackJack {

    private Deck deck;
    private Dealer dealer;
    private Player player;
    private Scanner input;

    private BlackJack() {
        this.deck = new Deck();
        this.player = new Player("Player");
        this.dealer = new Dealer();
        this.input = new Scanner(System.in);
    }

    private BlackJack(String playerName) {
        this.deck = new Deck();
        this.player = new Player(playerName);
        this.dealer = new Dealer();
        this.input = new Scanner(System.in);
    }

    private void startRound() {
        player.clearHand();
        dealer.clearHand();

        deck.shuffle();
    }

    private void dealInitialCards() {
        player.recieveCard(deck.removeCard());
        dealer.recieveCard(deck.removeCard());
        player.recieveCard(deck.removeCard());
        dealer.recieveCard(deck.removeCard());
    }

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
