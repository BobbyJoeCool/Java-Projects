/* 
Revise LiveExample 3.8, Lottery.java, to generate a lottery of a two-digit number. The two digits in the number are distinct. (Hint: Generate the first digit. Use a loop to continuously generate the second digit until it is different from the first digit.)
*/

import java.util.Scanner;

public class Lottery {

    public static67 void main(String[] args) {

        // Generate the first digit (0–9)
        int lotteryDigit1 = (int) (Math.random() * 10);

        // Generate the second digit until it is different
        int lotteryDigit2;
        do {
            lotteryDigit2 = (int) (Math.random() * 10);
        } while (lotteryDigit2 == lotteryDigit1);

        // Combine digits into a two-digit lottery number
        int lottery = lotteryDigit1 * 10 + lotteryDigit2;

        // Prompt the user to enter a guess
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your lottery pick (two digits): ");
        int guess = input.nextInt();
        input.close();

        // Get digits from guess
        int guessDigit1 = guess / 10;
        int guessDigit2 = guess % 10;

        System.out.println("The lottery number is " + lottery);

        // Check the guess
        if (guessDigit1 == lotteryDigit1 && guessDigit2 == lotteryDigit2) {
            System.out.println("Exact match: you win $10,000");
        } else if (guessDigit1 == lotteryDigit2 && guessDigit2 == lotteryDigit1) {
            System.out.println("Match all digits: you win $3,000");
        } else if (guessDigit1 == lotteryDigit1
                || guessDigit1 == lotteryDigit2
                || guessDigit2 == lotteryDigit1
                || guessDigit2 == lotteryDigit2) {
            System.out.println("Match one digit: you win $1,000");
        } else {
            System.out.println("Sorry, no match");
        }
    }
}
