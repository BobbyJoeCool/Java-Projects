package model;

import java.util.ArrayList;
import java.util.List;

public class Hand {

    private final List<Card> cards = new ArrayList<>();

    public void addCard(Card card) {
        cards.add(card);
    }

    public List<Card> getCards() {
        return cards;
    }

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

    public boolean isBust() {
        return getValue() > 21;
    }

    public void clear() {
        cards.clear();
    }

    @Override
    public String toString() {
        return cards.toString() + " (" + getValue() + ")";
    }
}
