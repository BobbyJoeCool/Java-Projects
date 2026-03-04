/* 
Write a program the displays the areas and perimeter of:
a rectangle that has width of 4.5 and height of 7.9
*/

public class AreaAndPerimeter {
    public static void main(String[] args) {
        double height = 7.9, width = 4.5;
        double perimeter, area;
        perimeter = (2 * height) + (2 * width);
        area = width * height;
        System.out.println("The rectangle has a height of " + height + " units and a width of " + width + " units");
        System.out.println("The perimeter of the rectangle is: " + perimeter + " units.");
        System.out.println("The area of the rectangle is: " + area + " square units.");
    }
}