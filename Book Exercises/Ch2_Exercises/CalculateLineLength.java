/* 
Write a program that prompts the user to enter two points 
(x1, y1) and (x2, y2) and displays their distance.
The formula for computing distance is:
sqrt((x2-x1)^2+(y2-y1)^2)
you can use Math.pow(a, 0.5) to calculate sqrt.
*/

import java.util.Scanner;

public class CalculateLineLength {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the x1 coordinate: ");
        double x1 = input.nextDouble();
        System.out.print("Enter the y1 coordinate: ");
        double y1 = input.nextDouble();
        System.out.print("Enter the x2 coordinate: ");
        double x2 = input.nextDouble();
        System.out.print("Enter the y2 coordinate: ");
        double y2 = input.nextDouble();

        double distance = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));

        System.out.println("The distance between the two points is " + distance + ".");

        input.close();
    }
}