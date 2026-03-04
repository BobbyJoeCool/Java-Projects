/* 
In an n-sided regular polygon, all sides have the same length and all angles have the same degree (i.e., the polygon is both equilateral and equiangular). Design a class named RegularPolygon that contains:
    A private int data field named n that defines the number of sides in the polygon with default value 3.
    A private double data field named side that stores the length of the side with default value 1.
    A private double data field named x that defines the x-coordinate of the polygon’s center with default value 0.
    A private double data field named y that defines the y-coordinate of the polygon’s center with default value 0.
    A no-arg constructor that creates a regular polygon with default values.
    A constructor that creates a regular polygon with the specified number of sides and length of side, centered at (0, 0).
    A constructor that creates a regular polygon with the specified number of sides, length of side, and x- and y-coordinates.
    The accessor and mutator methods for all data fields.
    The method getPerimeter() that returns the perimeter of the polygon.
    The method getArea() that returns the area of the polygon. The formula for computing the area of a regular polygon is

Area=(n×s^2) / (4×tan(π/n)).

Draw the UML diagram for the class then implement the class. Write a test program that creates three RegularPolygon objects, created using the no-arg constructor, using RegularPolygon(6, 4), and using RegularPolygon(10, 4, 5.6, 7.8). For each object, display its perimeter and area. Use the template at https://liveexample.pearsoncmg.com/test/Exercise09_09.txt for your code.
*/

public class PolygonCalculator {
    public static void main(String[] args) {
        
        RegularPolygon[] polygons = new RegularPolygon[3];

        polygons[0] = new RegularPolygon();
        polygons[1] = new RegularPolygon(6, 4);
        polygons[2] = new RegularPolygon(10,4,5.6,7.8);
        
        int count = 1;

        for (RegularPolygon p : polygons) {
            System.out.printf("Polygon %d:%n", count);
            System.out.printf("The polygon has %d sides.%n", p.getN());
            System.out.printf("The size of each side is %.2f.%n", p.getSide());
            System.out.printf("The coordinates of the center of the polygon are (%.2f, %.2f).%n", p.getX(), p.getY());
            System.out.printf("The perimeter of the polygon is %.2f.%n", p.getPerimeter());
            System.out.printf("The area of the polygon is %.2f.%n", p.getArea());
            System.out.println("---------------------------------------");
            count ++;
        }
    }
}

class RegularPolygon {
    private int n = 3; // number of sides
    private double side = 1; // length of the sides
    private double x = 0; // x coordinate of the center
    private double y = 0; // y coordinate of the center

    public RegularPolygon() {
    }

    public RegularPolygon(int n, double side) {
        this.n = n;
        this.side = side;
    }

    public RegularPolygon(int n, double side, double x, double y) {
        this.n = n;
        this.side = side;
        this.x = x;
        this.y = y;
    }

    public int getN() {
        return this.n;
    }

    public void setN(int n) {
        if (n >= 3) {
            this.n = n;
        }
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        if (side > 0) {
            this.side = side;
        }
    }

    public double getX() {
        return this.x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return this.y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getPerimeter() {
        return this.n * this.side;
    }
    
    // Area  = (n×s^2) / (4×tan(π/n))
    public double getArea() {
        double numerator = this.n * this.side * this.side;
        double denominator = 4 * Math.tan(Math.PI / this.n);
        double area = numerator / denominator;
        return area;
    }
}
