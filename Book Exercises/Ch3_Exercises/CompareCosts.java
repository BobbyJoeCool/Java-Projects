/*
Suppose you shop for rice in two different packages. You would like to write a program to compare the cost. The program prompts the user to enter the weight and price of each package and displays the one with the better price.
*/

import java.util.Scanner;

public class CompareCosts {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the price of the first bag: ");
        double priceBag1 = input.nextDouble();
        System.out.print("Enter the lbs of the first bag: ");
        double weightBag1 = input.nextDouble();
        double pricePerPound1 = priceBag1 / weightBag1;

        System.out.print("Enter the price of the second bag: ");
        double priceBag2 = input.nextDouble();
        System.out.print("Enter the lbs of the second bag: ");
        double weightBag2 = input.nextDouble();
        double pricePerPound2 = priceBag2 / weightBag2;

        if (pricePerPound1 < pricePerPound2) {
            System.out.printf("The first bag has a better price at $%.2f per pound.\n", pricePerPound1);
        } else if (pricePerPound1 > pricePerPound2) {
            System.out.printf("The second bag has a better price at $%.2f per pound.\n", pricePerPound2);
        } else if (pricePerPound1 == pricePerPound2) {
            System.out.printf("Both bags have the same value at $%.2f per pound.\n", pricePerPound1);
        }
    }
}