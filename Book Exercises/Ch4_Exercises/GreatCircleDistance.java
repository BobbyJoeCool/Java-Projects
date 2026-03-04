/* 
The great circle distance is the distance between two points on the surface of a sphere. Let (x1,  y1) and (x2,  y2) be the geographical latitude and longitude of two points. The great circle distance between the two points can be computed using the following formula:

d=radius×arccos(sin(x1)×sin(x2)+cos(x1)×cos(x2)×cos(y1−y2))

Write a program that prompts the user to enter the latitude and longitude of two points on the earth in degrees and displays its great circle distance. The average radius of the earth is 6,371.01 km. Note you need to convert the degrees into radians using the Math.toRadians method since the Java trigonometric methods use radians. The latitude and longitude degrees in the formula are for north and west. Use negative to indicate south and east degrees.
*/

import java.util.Scanner;

public class GreatCircleDistance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = 6371.01;

        System.out.println("You will enter two lat/long coordinates and this program will determine the distance between them.");
        System.out.println("Latitude and Longitude coordinates are (x[lat], y[long]).");
        System.out.println("Latitude is between -90 and 90. Longitude is between -180 and 180.");
        System.out.print("Enter the first latitude (x1): ");
        double x1 = input.nextDouble();
        System.out.print("Enter the first longitude (y1): ");
        double y1 = input.nextDouble();
        System.out.print("Enter the second latitude (x2): ");
        double x2 = input.nextDouble();
        System.out.print("Enter the second longitude (y2): ");
        double y2 = input.nextDouble();

        boolean x1invalid = Math.abs(x1) > 90;
        boolean x2invalid = Math.abs(x2) > 90;
        boolean y1invalid = Math.abs(y1) > 180;
        boolean y2invalid = Math.abs(y2) > 180;

        if (x1invalid || x2invalid || y1invalid || y2invalid) {
            System.out.print("Invalid input detected.");
            input.close();
            return;
        }

        double lat1 = Math.toRadians(x1);
        double lon1 = Math.toRadians(y1);
        double lat2 = Math.toRadians(x2);
        double lon2 = Math.toRadians(y2);

        double distance = radius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
    
        System.out.printf("The distance between the two points (%.2f, %.2f) and (%.2f, %.2f) is %.3f km.", x1, y1, x2, y2, distance);

        input.close();
    }
}
