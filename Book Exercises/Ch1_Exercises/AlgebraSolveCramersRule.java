/*
Use Cramer's Rule to solve the following 2x2 system of liner equations
provided ad - bc /= 0

ax+by=e
cx+dy=f
x=(ed-bf)/(ad-bc)
y=(af-ec)/(ad-bc)

Write a program that solves the following equation and displays the value for x and y.

3.14x + 50.2y = 44.5
2.1x + .55y = 5.9
*/

public class AlgebraSolveCramersRule {
    public static void main(String[] args) {
        double a = 3.14, b = 50.2, c = 2.1, d = .55, e = 44.5, f = 5.9;
        double x, y;
        x = (e * d - b * f) / (a * d - b * c);
        y = (a * f - e * c) / (a * d - b * c);
        System.out.println("Given " + a + "x + " + b + "y = " + e);
        System.out.println("and " + c + "x + " + d + " y = " + f);
        System.out.println("x = " + x + " and y = " + y);
    }
}