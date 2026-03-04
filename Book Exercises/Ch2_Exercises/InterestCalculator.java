/*
If you know the balance and the annual percentage interest rate, 
you can compute the interest on the next monthly payment using the following formula:

interest=balance×(annualInterestRate/1200)

Write a program that reads the balance and the annual percentage interest rate and displays the interest for the next month.
*/

import java.util.Scanner;

public class InterestCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the current balance of the loan: ");
        double balance = input.nextDouble();

        System.out.print("Enter the annual percentage rate.  For example, if it is 5%, enter 5: ");
        double rate = input.nextDouble();

        double interest = balance * (rate/1200);

        System.out.printf("The interest on the next monthly payment will be $%.2f.%n", interest);

        input.close();
    }
}