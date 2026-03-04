/*
Write a program that prompts the user to enter three points, 
(x1, y1), (x2, y2), and (x3, y3), of a triangle then displays its area. 
The formula for computing the area of a triangle is
s = (s1 + s2 + s3)/2
A = sqrt(s(s-s1)(s-s2)(s-s3))
*/

import java.util.Scanner;

public class CalculateTriangleArea {
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
        System.out.print("Enter the x3 coordinate: ");
        double x3 = input.nextDouble();
        System.out.print("Enter the y3 coordinate: ");
        double y3 = input.nextDouble();
        

        // Calculate the side lengths
        double s1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double s2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double s3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

        double s = (s1 + s2 + s3) / 2;

        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));

        System.out.printf("The area of the triangle is %.4f.%n", area);

        input.close();
    }
}