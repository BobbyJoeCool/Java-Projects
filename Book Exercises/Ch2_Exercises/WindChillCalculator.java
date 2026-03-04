/*
Wind Chill measurement formula:
t_wc = 35.74 + 0.6215t_a - 35.75 v^0.16 + 0.4275t_a*v^0.16
t_a is the outside temperature in °F 
v is the speed measured in mph
and t_wc is the wind chill temperature.

The formula cannot be used for temperatures below -58° F or above 41° F
or for wind speeds below 2mph.

Write a program that prompts the user to enter a valid temperature
and a wind speed greater than or equal to 2mph
and displays the windchill temp.
math.pow(a, b) computes a^b
*/

import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in Fahrenheit between -58° and 41°: ");
        double airTemp = input.nextDouble();

        System.out.print("Enter a wind speed in MPH greater than or equal to 2mph: ");
        double windSpeed = input.nextDouble();

        if (-58 <= airTemp && airTemp <= 41 && windSpeed >= 2) {
        double windchill = 35.74 + 0.6215 * airTemp - 35.75 * Math.pow(windSpeed, 0.16) + 0.4275 * airTemp * Math.pow(windSpeed , 0.16);

        System.out.printf("The temperature adjusted for windchill is %.1f°F.%n", windchill);
        } else {
            System.out.println("Invalid input(s).");
        }
        input.close();
    }
}