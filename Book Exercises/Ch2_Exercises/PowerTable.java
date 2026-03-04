/*
Write a program that displays the following table.
Cast floating-point numbers into integers.

a       b       pow(a, b)
1       2       1
2       3       8
3       4       81
4       5       1024
5       6       15625
*/

public class PowerTable {
    public static void main(String[] args) {

        System.out.printf("%-8s%-8s%-10s%n", "a", "b", "pow(a, b)");

        System.out.printf("%-8d%-8d%-10d%n", 1, 2, (int) Math.pow(1, 2));
        System.out.printf("%-8d%-8d%-10d%n", 2, 3, (int) Math.pow(2, 3));
        System.out.printf("%-8d%-8d%-10d%n", 3, 4, (int) Math.pow(3, 4));
        System.out.printf("%-8d%-8d%-10d%n", 4, 5, (int) Math.pow(4, 5));
        System.out.printf("%-8d%-8d%-10d%n", 5, 6, (int) Math.pow(5, 6));
    }
}