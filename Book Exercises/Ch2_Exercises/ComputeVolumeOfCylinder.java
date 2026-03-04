/* 
Write a program that reads in the radius and length of a cylinder
and computes the area and volume.
A = πr^2
V = A*l
*/

import java.util.Scanner;

public class ComputeVolumeOfCylinder {
    public static void main(String[] args) {
        double area, volume, PI = 3.14159, radius, height;

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the radius of the base of the cylinder: ");
        radius = input.nextDouble();

        System.out.print("Enter the height of the cylinder: ");
        height = input.nextDouble();

        area = PI * radius * radius;
        volume = area * height;

        System.out.println("The surface area of the cylinder is: " + area + " square units");
        System.out.println("The volume of the cylinder is " + volume + " cubic units");

        input.close();
    }
}