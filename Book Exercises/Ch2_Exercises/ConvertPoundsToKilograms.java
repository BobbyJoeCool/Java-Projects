/* 
Write a program that converts pounds into kg.
The program prompts the user to enter a number of lbs.
converts it to kg, then displays the result.
1lb = 0.454kg
*/

import java.util.Scanner;

public class ConvertPoundsToKilograms {
    public static void main(String[] args) {
        double pounds, kilograms;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of pounds: ");
        pounds = input.nextDouble();

        kilograms = pounds * 0.454;

        System.out.println(pounds + " lbs is equal to " + kilograms + " kg.");

        input.close();
    }
}