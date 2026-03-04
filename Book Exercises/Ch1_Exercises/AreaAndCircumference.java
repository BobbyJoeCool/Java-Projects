/* 
Write a program the displays the areas and perimeter of:
a circle that has radius of 5.5
*/

public class AreaAndCircumference {
    public static void main(String[] args) {
        double PI = 3.14159, radius = 5.5;
        double circumference, area;
        circumference = 2 * radius * PI;
        area = radius * radius * PI;
        System.out.println("The circle has a radius of " + radius + " units.");
        System.out.println("The circumference of the circle is: " + circumference + " units.");
        System.out.println("The area of the circle is: " + area + " square units.");
    }
}