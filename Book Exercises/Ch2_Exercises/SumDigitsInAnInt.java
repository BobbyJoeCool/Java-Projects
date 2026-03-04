/* 
Write a program that reads an integer between 0-1000 
and adds all the digits in the integer.
HINT: Use the % operator to extract the digit and the / operator to remove the extracted digit.
Example 932 % 10 = 2, 932 / 10 = 93
*/

import java.util.Scanner;

public class SumDigitsInAnInt {
    public static void main(String[] args) {
        int startingNumber, number, sum, digit1, digit2, digit3, digit4;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an integer between 0-1000: ");
        startingNumber = input.nextInt();

        number = startingNumber;

        digit1 = number % 10;
        number /= 10;

        digit2 = number % 10;
        number /= 10;

        digit3 = number % 10;
        number /= 10;

        digit4 = number % 10;
        number /= 10;

        sum = digit1 + digit2 + digit3 + digit4;

        System.out.println("The sum of the digits of " + startingNumber + " is " + sum + ".");

        input.close();
    }
}