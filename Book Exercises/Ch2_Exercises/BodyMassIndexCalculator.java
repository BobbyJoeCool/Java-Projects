/* 
Body Mass Index(BMI) is a measure of health on weight.  
BMI = weight(kg)/((height(m))^s)
Write a program that prompts the user to enter a weight in lbs and heigh in inches and displays the BMI.
1 lb = 0.45359237 kg and 1 in = 0.0254 m
*/

import java.util.Scanner;

public class BodyMassIndexCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your weight in pounds: ");
        double weightLBS = input.nextDouble();

        System.out.print("Enter your height in inches: ");
        double heightIN = input.nextDouble();

        double weightKG = weightLBS * 0.45359237;
        double heightM = heightIN * 0.0254;

        double bmi = weightKG / (heightM * heightM);

        System.out.println("The BMI for a person of " + weightLBS + " lbs. and " + heightIN + " in. tall is " + bmi + ".");

        input.close();
    }
}