package model;

/**
 * Represents a playing card with a suit and rank.
 */
public class Card {

    private final Suit suit;
    private final Rank rank;

    /**
     * Constructs a new Card with the given suit and rank.
     * @param suit the suit of the card
     * @param rank the rank of the card
     */
    public Card(Suit suit, Rank rank) {
        this.suit = suit;
        this.rank = rank;
    }

    /**
     * Gets the suit of the card.
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * Gets the rank of the card.
     * @return the rank
     */
    public Rank getRank() {
        return rank;
    }

    /**
     * Gets the value of the card based on its rank.
     * @return the value
     */
    public int getValue() {
        return rank.getValue();
    }

    /**
     * Returns a string representation of the card.
     * @return the string representation
     */
    @Override
    public String toString() {
        return rank + " of " + suit;
    }
}
