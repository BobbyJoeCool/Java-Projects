/* 
Write a program that reads the subtotal and the gratuity rate, 
then computes the gratuity and total.
*/

import java.util.Scanner;

public class CalculateTips {
    public static void main(String[] args) {
        double subtotal, rate, gratRate, gratuity, total;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the bill Subtotal (numbers only): ");
        subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate (for example, for 15%, enter 15): ");
        rate = input.nextDouble();

        gratRate = rate / 100;
        gratuity = subtotal * gratRate;
        total = subtotal + gratuity;

        System.out.println("For a bill of $" + subtotal + ", the tip is $" + gratuity +".");
        System.out.println("The new total, including tip is $" + total + ".");

        input.close();
    }
}

