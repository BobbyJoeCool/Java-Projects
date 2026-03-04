/* 
Write a program that prompts the user to enter
the side of a hexagon and display its area.
A = (3*sqrt(3)/2)*s^2
*/

import java.util.Scanner;

public class CalculateHexagonArea {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side length of a regular Hexagon: ");
        double side = input.nextDouble();

        double area = (3 * Math.sqrt(3) ) / 2 * (side * side);

        System.out.println("The area of the hexagon is " + area + " cubic units.");

        input.close();
    }
}