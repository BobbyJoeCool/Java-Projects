/*
Suppose you save $100 each month into a savings account with an annual interest rate of 5%.
Therefore, the monthly interest rate is 0.05/12 = 0.00417.

Write a program that prompts the user to enter a month saving amount and displays 
the account value after 6 months.  
(Do not use a loop just yet, as you haven't learned them)
*/

import java.util.Scanner;

public class AnnualInterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("You have a savings account with an APR of 5%, compounded monthly.");
        System.out.print("Enter an amount to put in the account each month (eg: 25 or 25.25): ");
        double depositAmount = input.nextDouble();

        double rate = .05/12;

        double accountBalance = depositAmount; // Initial Deposit
        accountBalance += accountBalance * rate; // Adds the interest at the end of month 1.
        accountBalance += depositAmount; // Month 2 deposit
        accountBalance += accountBalance * rate; // Adds the interest at the end of month 2.
        accountBalance += depositAmount; // Month 3 deposit
        accountBalance += accountBalance * rate; // Adds the interest at the end of month 3.
        accountBalance += depositAmount; // Month 4 deposit
        accountBalance += accountBalance * rate; // Adds the interest at the end of month 4.
        accountBalance += depositAmount; // Month 5 deposit
        accountBalance += accountBalance * rate; // Adds the interest at the end of month 5.
        accountBalance += depositAmount; // Month 6 deposit
        accountBalance += accountBalance * rate; // Adds the interest at the end of month 6.

        System.out.printf(
            "The account balance, with a deposit of $%.2f each month after 6 months is $%.2f%n",
            depositAmount,
            accountBalance
        );

        input.close();
    }
}