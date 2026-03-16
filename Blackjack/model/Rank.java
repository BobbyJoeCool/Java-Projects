package model;

/**
 * Enumeration of card ranks in a standard deck.
 */
public enum Rank {
    TWO(2),
    THREE(3),
    FOUR(4),
    FIVE(5),
    SIX(6),
    SEVEN(7),
    EIGHT(8),
    NINE(9),
    TEN(10),
    JACK(10),
    QUEEN(10),
    KING(10),
    ACE(11);

    private final int value;

    /**
     * Constructs a Rank with the given value.
     * @param value the value of the rank
     */
    Rank(int value) {
        this.value = value;
    }

    /**
     * Gets the value of the rank.
     * @return the value
     */
    public int getValue() {
        return value;
    }
}
