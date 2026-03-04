/* 
Write a program that prompts the user to enter the exchange rate from currency in U.S. dollars to Indonesian Rupiah. Prompt the user to enter 0 to convert from U.S. dollars to Indonesian Rupiah and 1 to convert from Indonesian Rupiah to U.S. dollars. Prompt the user to enter the amount in U.S. dollars or Indonesian Rupiah to convert it to Indonesian Rupiah or U.S. dollars, respectively.
*/

import java.util.Scanner;

public class CurrencyExchange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double rate = 16965.15;

        System.out.println("The exchange rate for the US dollar and the Indonesian Rupiah is $1.00:" + rate + " Rupiahs");

        System.out.println("Enter the number from the following options:");
        System.out.println("1) From US Dollars -> Indonesian Rupiah.");
        System.out.println("2) From Indonesian Rupiah -> US Dollars.");
        System.out.print("What is your selection: ");
        int selection = input.nextInt();

        double dollars = 0, rupiahs = 0;

        if (selection == 1) {
            System.out.print("Enter an amount in US dollars: ");
            dollars = input.nextDouble();
            rupiahs = dollars * rate;
        } else if (selection == 2) {
            System.out.print("Enter an amount in Indonesian Rupiah's: ");
            rupiahs = input.nextDouble();
            dollars = rupiahs / rate;
        } else {
            System.out.println("Invalid Selection");
            System.exit(0);
        }

        System.out.printf("%.2f US Dollars is equivalent to %.2f Indonesian Rupiahs.", dollars, rupiahs);

    }
}
