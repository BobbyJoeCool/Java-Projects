/* 
In business applications, you are often asked to compute the mean and standard deviation of data. The mean is simply the average of the numbers. The standard deviation is a statistic that tells you how tightly all the various data are clustered around the mean in a set of data. For example, what is the average age of the students in a class? How close are the ages? If all the students are the same age, the deviation is 0.
Write a program that prompts the user to enter 10 numbers and displays the mean and standard deviations of these numbers using the following formula:
(See Book for Formula)
*/

import java.util.Scanner;

public class ComputeMeanAndStandardDeviation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sum = 0, sumSquared = 0;

        System.out.println("Enter 10 numbers to find the standard deviation and mean.\n");

        // Loops for the 10 input, then gets a sum, and a sum of the Squares
        for (int i=0; i < 10; i++) {
            System.out.print("Enter a number: ");
            double value = input.nextDouble();
            sum += value;
            sumSquared += Math.pow(value, 2);
        }

        input.close();

        double mean = sum / 10;
        double deviation = Math.sqrt((sumSquared - (sum * sum) / 10) / (9));

        System.out.printf("The mean is %.6f%n", mean);
        System.out.printf("The standard deviation is %.6f%n", deviation);
    }
}
