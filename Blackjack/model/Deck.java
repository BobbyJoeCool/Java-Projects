package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Represents a deck of 52 playing cards.
 */
public class Deck {

    private final List<Card> cards = new ArrayList<>();

    /**
     * Constructs a new Deck, builds it with all cards and shuffles.
     */
    public Deck() {
        buildDeck();
        shuffle();
    }

    /**
     * Builds the deck with all 52 cards.
     */
    private void buildDeck() {
        for (Suit suit : Suit.values()) {
            for (Rank rank : Rank.values()) {
                cards.add(new Card(suit, rank));
            }
        }
    }

    /**
     * Shuffles the deck.
     */
    public void shuffle() {
        Collections.shuffle(cards);
    }

    /**
     * Removes and returns the top card from the deck.
     * @return the top card
     */
    public Card removeCard() {
        return cards.remove(0);
    }

    /**
     * Gets the number of cards remaining in the deck.
     * @return the size
     */
    public int size() {
        return cards.size();
    }
}
