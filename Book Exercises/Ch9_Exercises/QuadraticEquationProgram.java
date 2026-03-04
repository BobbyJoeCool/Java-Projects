/* 
Design a class named QuadraticEquation for a quadratic equation ax2+bx+c=0. The class contains:
Private data fields a, b, and c that represent three coefficients.
A constructor with the arguments for a, b, and c.
Three getter methods for a, b, and c.
A method named getDiscriminant() that returns the discriminant, which is b2−4ac.
The methods named getRoot1() and getRoot2() for returning two roots of the equation.

r1= −b+sqrt((b^2−4ac)/(2a)) and r2= −b−sqrt((b^2−4ac)/(2a)

These methods are useful only if the discriminant is nonnegative. Let these methods return NaN if the discriminant is negative.
Draw the UML diagram for the class then implement the class. Write a test program that prompts the user to enter values for a, b, and c and displays the result based on the discriminant. If the discriminant is positive, display the two roots. If the discriminant is 0, display the one root. Otherwise, display “The equation has no roots.”

*/

import java.util.Scanner;

public class QuadraticEquationProgram {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values for a, b, and c.");
        System.out.println("A = ");
        double a = input.nextDouble();
        System.out.println("B = ");
        double b = input.nextDouble();
        System.out.println("C = ");
        double c = input.nextDouble();

        QuadraticEquation quadEqu = new QuadraticEquation(a, b, c);

        System.out.println("A = " + quadEqu.getA());
        System.out.println("B = " + quadEqu.getB());
        System.out.println("C = " + quadEqu.getC());
        System.out.println("Discriminant = " + quadEqu.getDiscriminant());
        double r1 = quadEqu.getRoot1();
        double r2 = quadEqu.getRoot2();
        if (!Double.isNaN(r1)) {
            System.out.println("Root 1 = " + r1);
        } else {
            System.out.println("No Real Roots,");
        }
        if (!Double.isNaN(r1)) {
            System.out.println("Root 2 = " + r2);
        }

    }
}

class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return (this.b * this.b - 4 * this.a * this.c);
    }

    public double getRoot1 () {
        double discriminant = getDiscriminant();

        if (discriminant >= 0) {
            return (-this.b + Math.sqrt(discriminant)) / (2 * this.a);
        } else {
            return Double.NaN; //Returns not a number
        }
    }

    public double getRoot2() {
        double discriminant = getDiscriminant();

        if (discriminant > 0) {
            return (-this.b - Math.sqrt(discriminant)) / (2 * this.a);
        } else {
            return Double.NaN; //Returns not a number
        }
    }
}
