package actor;

import model.Card;
import model.Hand;

/**
 * Represents a player in the Blackjack game, holding a name and a hand of cards.
 */
public class Player {

    protected final String name;
    protected final Hand hand;

    /**
     * Constructs a new Player with the given name.
     * @param name the name of the player
     */
    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    /**
     * Gets the name of the player.
     * @return the player's name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the hand of the player.
     * @return the player's hand
     */
    public Hand getHand() {
        return hand;
    }

    /**
     * Adds a card to the player's hand.
     * @param card the card to add
     */
    public void recieveCard(Card card) {
        hand.addCard(card);
    }

    /**
     * Gets the total value of the player's hand.
     * @return the hand value
     */
    public int getHandValue() {
        return hand.getValue();
    }

    /**
     * Checks if the player's hand is bust (over 21).
     * @return true if bust, false otherwise
     */
    public boolean isBust() {
        return hand.isBust();
    }

    /**
     * Clears all cards from the player's hand.
     */
    public void clearHand() {
        hand.clear();
    }

    /**
     * Returns a string representation of the player, including name and hand.
     * @return the string representation
     */
    @Override
    public String toString() {
        return name + ": " + hand.toString();
    }
}
