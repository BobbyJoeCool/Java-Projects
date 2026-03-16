package model;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a hand of cards in Blackjack.
 */
public class Hand {

    private final List<Card> cards = new ArrayList<>();

    /**
     * Adds a card to the hand.
     * @param card the card to add
     */
    public void addCard(Card card) {
        cards.add(card);
    }

    /**
     * Gets the list of cards in the hand.
     * @return the list of cards
     */
    public List<Card> getCards() {
        return cards;
    }

    /**
     * Calculates the total value of the hand, adjusting Aces as needed.
     * @return the hand value
     */
    public int getValue() {
        int total = 0;
        int aceCount = 0;

        for (Card card : cards) {
            total += card.getValue();

            if (card.getRank() == Rank.ACE) {
                aceCount++;
            }
        }

        // Adjust Ace values if bust
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }

        return total;
    }

    /**
     * Checks if the hand is bust (value over 21).
     * @return true if bust, false otherwise
     */
    public boolean isBust() {
        return getValue() > 21;
    }

    /**
     * Clears all cards from the hand.
     */
    public void clear() {
        cards.clear();
    }

    /**
     * Returns a string representation of the hand, including cards and value.
     * @return the string representation
     */
    @Override
    public String toString() {
        return cards.toString() + " (" + getValue() + ")";
    }
}
