/*
Rewrite Programming Exercise 1.11 to prompt the user to enter the number 
of years to display the population after the number of years.
*/

import java.util.Scanner;

public class PopulationProjection {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of years to project the population for: ");
        int years = input.nextInt();

        int birthInterval = 7, deathInterval = 13, migrationInverval = 45;
        int birthPerYear, deathPerYear, migrationPerYear, secondsPerYear;
        int totalAddedPerYear;
        int startingPopulation = 312_032_486, endingPopulation;
        secondsPerYear = 365 /*days*/ * 24 /*hours*/ * 60 /*minutes*/ * 60 /*seconds*/;
        birthPerYear = secondsPerYear / birthInterval;
        deathPerYear = secondsPerYear / deathInterval;
        migrationPerYear = secondsPerYear / migrationInverval;
        totalAddedPerYear = birthPerYear - deathPerYear + migrationPerYear;
        endingPopulation = startingPopulation + (totalAddedPerYear * years);
        System.out.println("The population after " + years + " year(s) is: " + endingPopulation);

        input.close();
    }
}