/* 
Write a program that prompts the user to enter the distance to drive, 
the fuel efficiency of the car in miles per gallon, 
and the price per gallon then displays the cost of the trip.
*/

import java.util.Scanner;

public class CalculateCostOfTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the distance you are driving in miles: ");
        double distance = input.nextDouble();

        System.out.print( "Enter the fuel efficiency of your vehicle in mpg: ");
        double milesPerGallon = input.nextDouble();

        System.out.print( "Enter the price of gasoline per gallon (example, for $2.98 per gallon enter 2.98): ");
        double pricePerGallon = input.nextDouble();

        double cost = (distance / milesPerGallon) /*Figures the number of gallons needed*/ * pricePerGallon;

        System.out.printf("The cost of the gas for your trip will be $%.2f. %n", cost);

        input.close();
    }
}