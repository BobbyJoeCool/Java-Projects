/*
Given an airplane's acceleration "a" and take-off speed "v",
you can computer the minimum runway length needed for an airplane to take off:
length = v^2 / (2a)
Write a program that prompts the user to enter v in m/s, the acceleration a in m/(s^2)
and then displays the minimum runway length.
*/

import java.util.Scanner;

public class CalculateRunwayLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the planes take-off velocity in meters per second: ");
        double velocity = input.nextDouble();

        System.out.print("Enter the planes acceleration in m/s^2: ");
        double acceleration = input.nextDouble();

        double runwayLength = (velocity * velocity) / (2 * acceleration);

        System.out.println("The plane needs a runway length of " + runwayLength + " meters.");

        input.close();
    }
}