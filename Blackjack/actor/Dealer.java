package actor;

/**
 * Represents the dealer in the Blackjack game.
 * The dealer follows standard rules, hitting until 17 or higher.
 */
public class Dealer extends Player {

    /**
     * Constructs a new Dealer with the name "Dealer".
     */
    public Dealer() {
        super("Dealer");
    }

    /**
     * Returns a string representation of the dealer's hand, showing only the second card.
     * @return the dealer's hand string
     */
    public String getDealerHand() {
        return name + ": Showing " + hand.getCards().get(1).toString();
    }
}
