/*
Write a program that reads in investment amount, annual interest rate, 
and number of years and displays the future investment value using the following formula:

futureInvestmentValue =investmentAmount×(1 + monthlyInterestRate)^(numberOfYears*12)

For example, if you enter amount 1000, annual interest rate 3.25%, 
and number of years 1, the future investment value is 1032.98.
*/

import java.util.Scanner;

public class FutureInvestmentCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your investment amount: ");
        double investmentAmount = input.nextDouble();

        System.out.print("Enter your annual interest rate (for example, for 5%, enter 5: ");
        double apr = input.nextDouble();

        System.out.print("Enter the number of years to calculate the investment for:");
        int years = input.nextInt();
        double investmentLength = years;

        double monthlyInterestRate = apr / 1200;
        double futureInvestmentValue = investmentAmount * Math.pow((1 + monthlyInterestRate), (investmentLength * 12));

        System.out.printf("The value of your investment after %d year(s) is %.2f.%n", years, futureInvestmentValue);

        input.close();
    }
}