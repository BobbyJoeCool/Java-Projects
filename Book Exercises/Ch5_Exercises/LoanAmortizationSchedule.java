/* 
The monthly payment for a given loan pays the principal and the interest. The monthly interest is computed by multiplying the monthly interest rate and the balance (the remaining principal). The principal paid for the month is therefore the monthly payment minus the monthly interest. Write a program that lets the user enter the loan amount, number of years, and interest rate then displays the amortization schedule for the loan.

Hint: Write a loop to display the table. Since the monthly payment is the same for each month, it should be computed before the loop. The balance is initially the loan amount. For each iteration in the loop, compute the interest and principal, and update the balance. The loop may look as follows:

for (i = 1; i <= numberOfYears * 12; i++) {
  interest = monthlyInterestRate * balance;
  principal = monthlyPayment – interest;
  balance = balance – principal;
  System.out.println(i + "\t\t" + interest
    + "\t\t" + principal + "\t\t" + balance);
}
*/
import java.util.Scanner;

public class LoanAmortizationSchedule {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Loan Amount: ");
        double loanAmount = input.nextDouble();

        System.out.print("Number of Years: ");
        int numberOfYears = input.nextInt();

        System.out.print("Annual Interest Rate (e.g., 7.5): ");
        double annualInterestRate = input.nextDouble();

        input.close();

        double monthlyInterestRate = (annualInterestRate / 100.0) / 12.0;
        int numberOfMonths = numberOfYears * 12;
        // Monthly payment formula: M = P * r / (1 - (1 + r) ^ (-n))
        double monthlyPayment;
        if (monthlyInterestRate == 0) {
            monthlyPayment = loanAmount / numberOfMonths;
        } else {
            monthlyPayment = loanAmount * monthlyInterestRate
                    / (1 - 1 / Math.pow(1 + monthlyInterestRate, numberOfMonths));
        }

        double balance = loanAmount;

        System.out.printf("%nMonthly Payment: %.2f%n", monthlyPayment);
        System.out.printf("Total Payment: %.2f%n%n", monthlyPayment * numberOfMonths);

        System.out.println("Payment#\tInterest\tPrincipal\tBalance");

        for (int paymentNumber = 1; paymentNumber <= numberOfMonths; paymentNumber++) {
            double interest = monthlyInterestRate * balance;
            double principal = monthlyPayment - interest;
            balance -= principal;
            // Prevent a tiny negative balance from floating - point rounding near the end
            if (balance < 0) {
                balance = 0;
            }

            System.out.printf("%d\t\t%.2f\t\t%.2f\t\t%.2f%n",
                    paymentNumber, interest, principal, balance);
        }
    }
}
