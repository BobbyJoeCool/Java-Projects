/*
Average acceleration is defined as the change in velocity over time.
a = (v1-v0)/t

Write a program the prompts the user to enter the starting velocity v0 in m/s
the ending velocity in m/s, the time span in seconds
then displays the average acceleration.
*/

import java.util.Scanner;

public class FindAcceleration {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the starting velocity in m/s: ");
        double startingVelocity = input.nextDouble();

        System.out.print("Enter the ending velocity in m/s: ");
        double endingVelocity = input.nextDouble();

        System.out.print("Enter the time between start and finish in seconds: ");
        double time = input.nextDouble();

        double acceleration = (endingVelocity - startingVelocity) / time;

        System.out.println("The average acceleration is: " + acceleration + " m/s^2.");

        input.close();
    }
}