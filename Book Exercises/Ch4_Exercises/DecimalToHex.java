/* 
Write a program that prompts the user to enter an integer between 0 and 15 and displays its corresponding hex number. For an incorrect input number, display invalid input.
*/

import java.util.Scanner;

public class DecimalToHex {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an Integer between 0 and 15");
        int dec = input.nextInt();

        String hex = switch (dec) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9 -> String.valueOf(dec);
            case 10 -> "A";
            case 11 -> "B";
            case 12 -> "C";
            case 13 -> "D";
            case 14 -> "E";
            case 15 -> "F";
            default -> "Invalid input";
        };

        if (hex == "Invalid input") {
            System.out.println("Invalid Input.");
        } else {
            System.out.println(dec + " in base 10 (decimal) is " + hex + " in base 16 (hexadecimal).");
        }

        input.close();
    }
}
