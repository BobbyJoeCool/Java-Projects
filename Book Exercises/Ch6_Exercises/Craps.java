/*
Craps is a popular dice game played in casinos. Write a program to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, ..., and 6, respectively. Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value (i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either a 7 or the same point value is rolled. If 7 is rolled, you lose. Otherwise, you win.
Your program acts as a single player.
*/

public class Craps {
    public static void main(String[] args) {
        int firstRoll = roll(), roll = 0;

        switch (firstRoll) {
            case 2, 3, 12:
                System.out.println("You rolled a " + firstRoll + "! That's a Craps!  You Lose!");
                return;
            case 7, 11:
                System.out.println("You rolled a " + firstRoll + "! That's a Natural!  You Win!");
                return;
        }

        System.out.println("Your initial roll is a " + firstRoll + ".");

        while (true) { 
            roll = roll();

            if (roll == 7) {
                System.out.println("You rolled " + roll + ". Craps!  You lost!");
                return;
            } else if (roll == firstRoll) {
                System.out.println("You rolled " + roll + "! That's a winner!");
                return;
            }

            System.out.println("You rolled " + roll + ".  Roll Again.");
        }

    }

    public static int roll() {
        int dice1, dice2, total;
        dice1 = (int)(Math.random() * 6) + 1;
        dice2 = (int)(Math.random() * 6) + 1;
        total = dice1 + dice2;
        return total;
    }
}
