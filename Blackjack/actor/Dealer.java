package actor;

public class Dealer extends Player {

    public Dealer() {
        super("Dealer");
    }

    public String getDealerHand() {
        return name + ": Showing " + hand.getCards().get(1).toString();
    }
}
