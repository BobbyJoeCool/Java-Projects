/* 
(Simulation: coupon collector’s problem) Coupon collector is a classic statistics problem with many practical applications. The problem is to repeatedly pick objects from a set of objects and find out how many picks are needed for all the objects to be picked at least once. A variation of the problem is to pick cards from a shuffled deck of 52 cards repeatedly, and find out how many picks are needed before you see one of each suit. Assume a picked card is placed back in the deck before picking another. Write a program to simulate the number of picks needed to get four cards from each suit and display the cards picked (it is possible a card may be picked twice).
*/

public class CouponCollector {
    public static void main(String[] args) {
        int[] cards = new int[52];
        boolean[] suits = new boolean[4];
        for (int i = 1; i <= cards.length; i++) {
            cards[i - 1] = i; //sets the array to be {1,2,3,4,5....}
        }

        /*
        The array:
        1-13 will be Spades (0 for the boolean)
        14-26 will be Hearts (1 for the boolean)
        27-39 will be Diamonds (2 for the boolean)
        40-52 will be Clubs.  (3 for the boolean)
        The first of each suit is an A, second 2, third 3...  11 J, 12, Q, 13 K.
        */

        int count = 0;

        do { 
            String card = pickACard(cards, suits);
            System.out.println("The card drawn is the " + card);
            count ++;
        } while (!(suits[0] && suits[1] && suits[2] && suits[3]));
        
        System.out.println("One card of each suit has been drawn!");
        System.out.println("A total of " + count + " cards were drawn.");
    }

    public static String pickACard(int[] cards, boolean[] suits) {
        int card = cards[(int)(Math.random()*cards.length)];
        int valueIndex = (card - 1) % 13;
        int suitIndex = (card - 1) / 13;
        
        String suit = switch (suitIndex) {
            case 0 -> "Spades";
            case 1 ->  "Hearts";
            case 2 -> "Diamonds";
            case 3 -> "Clubs";
            default -> "Invalid Suit";
        };

        suits[suitIndex] = true; // Sets the suit picked in the array to true.

        String value = switch (valueIndex) {
            case 0 -> "Ace";
            case 1,2,3,4,5,6,7,8,9 -> String.valueOf(valueIndex + 1);
            case 10 -> "Jack";
            case 11 -> "Queen";
            case 12 -> "King";
            default -> "Invalid Card";
        };

        return value + " of " + suit;
    }
}
