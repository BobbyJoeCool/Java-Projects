/* 
Credit card numbers follow certain patterns. A credit card number must have between 13 and 16 digits. It must start with

4 for Visa cards
5 for Master cards
37 for American Express cards
6 for Discover cards

In 1954, Hans Luhn of IBM proposed an algorithm for validating credit card numbers. The algorithm is useful to determine whether a card number is entered correctly, or whether a credit card is scanned correctly by a scanner. Credit card numbers are generated following this validity check, commonly known as the Luhn check or the Mod 10 check, which can be described as follows (for illustration, consider the card number 4388576018402626):


    1) Double every second digit from right to left. If doubling of a digit results in a two-digit number, add up the two digits to get a single-digit number.
    2) Now add all single-digit numbers from Step 1.
        4+4+8+2+3+1+7+8=37
    3) Add all digits in the odd places from right to left in the card number.
        6+6+0+8+0+7+8+3=38
    4) Sum the results from Step 2 and Step 3.
        37+38=75
    5) If the result from Step 4 is divisible by 10, the card number is valid; otherwise, it is invalid. For example, the number 4388576018402626 is invalid, but the number 4388576018410707 is valid.

Write a program that prompts the user to enter a credit card number as a long integer. Display whether the number is valid or invalid.
*/

import java.util.Scanner;

public class CreditCardNumberValidation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a credit card number: ");
        long cardNumber = input.nextLong();

        if (isValid(cardNumber)) {
            System.out.println("That card number is valid.");
        } else {
            System.out.println("That card number is invalid.");
        }

    }

    public static int sumOfDoubleEvenPlace(long cardNumber) {
        int sum = 0;

        //convert the card number to a string for manipulation
        String number = String.valueOf(cardNumber);

        for (int i = number.length() - 2; i >= 0; i -= 2) {
            int digit = number.charAt(i) - '0';
            digit *= 2;

            if (digit > 9) {
                int tens = digit / 10;
                int ones = digit % 10;
                digit = tens + ones;
            }

            sum += digit;
        }

        return sum;
    }

    public static int sumOfOddPlace(long cardNumber) {
        int sum = 0;

        //convert the card number to a string for manipulation
        String number = String.valueOf(cardNumber);

        for (int i = number.length() - 1; i >=0; i -= 2) {
            int digit = number.charAt(i) - '0';
            sum += digit;
        }

        return sum;
    }

    public static boolean isValid(long number) {
        String numberString = String.valueOf(number);
        if (numberString.length() < 13 || numberString.length() > 16) {
            return false;
        } // Checks the length of the card.

        if (!numberString.startsWith("4") && 
        !numberString.startsWith("5") && 
        !numberString.startsWith("6") && 
        !numberString.startsWith("37")) {
            return false;
        } // Checks that it is a valid card provider.

        int stepOne = sumOfDoubleEvenPlace(number);
        int stepTwo = sumOfOddPlace(number);
        int stepThree = stepOne + stepTwo;

        if (stepThree % 10 == 0) {
            return true;
        }

        return false;
    }
    
}
