/* 
Write a program that reads a Celsius Degree in a double value from the console,
then converts it to Fahrenheit, and displays the result.
°F = (9.0/5) * °C +32
*/

import java.util.Scanner;

public class ConvertCelsiusToFahrenheit{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a temperature in Celsius: ");
        double celsius = input.nextDouble();

        double fahrenheit = (9.0 / 5) * celsius + 32;

        System.out.println("Temperature in Fahrenheit: " + fahrenheit);

        input.close();
    }
}