/*
Write a program that reads a number in feet,
converts it to meters, and displays the results.
1ft = 0.305m
*/

import java.util.Scanner;

public class ConvertFeetToMeters {
    public static void main(String[] args) {
        double feet, meters;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of feet: ");
        feet = input.nextDouble();

        meters = feet * 0.305;

        System.out.println(feet + " ft is equal to " + meters + " meters.");

        input.close();
    }
}