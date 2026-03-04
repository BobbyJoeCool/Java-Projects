/*
Write a program that prompts the user to enter the minutes (eg 1 billion)
and displays the maximum number of years and remaining days for the minutes.
Assume every year has 365 days.
*/

import java.util.Scanner;

public class FindNumberOfYears {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number of minutes: ");
        int minutes = input.nextInt();

        int years = minutes / (365 * 24 * 60);
        int remainingMinutes = minutes - (years * 365 * 24 * 60);
        int days = remainingMinutes / (24 * 60);
        remainingMinutes -= (days * 24 * 60);

        System.out.println(minutes + " minutes is equal to " + years + " years, " + days + " days, " + remainingMinutes + " minutes.");

        input.close();
    }
}