package actor;

import model.Card;
import model.Hand;

public class Player {

    protected final String name;
    protected final Hand hand;

    public Player(String name) {
        this.name = name;
        this.hand = new Hand();
    }

    public String getName() {
        return name;
    }

    public Hand getHand() {
        return hand;
    }

    public void recieveCard(Card card) {
        hand.addCard(card);
    }

    public int getHandValue() {
        return hand.getValue();
    }

    public boolean isBust() {
        return hand.isBust();
    }

    public void clearHand() {
        hand.clear();
    }

    @Override
    public String toString() {
        return name + ": " + hand.toString();
    }
}
