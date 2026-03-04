/* 
The US Census Bureau projects population based on the following assumptions:
    - One birth every 7 seconds
    - One death every 13 seconds
    - One new international migration every 45 seconds
Write a program to display the population for each of the next five years.
Assume the current population is 312,032,486 and a year has 365 days.
*/

public class PopulationProjection {
    public static void main(String[] args) {
        int birthInterval = 7, deathInterval = 13, migrationInverval = 45;
        int birthPerYear, deathPerYear, migrationPerYear, secondsPerYear;
        int totalAddedPerYear;
        int startingPopulation = 312_032_486, endingPopulation;
        secondsPerYear = 365 /*days*/ * 24 /*hours*/ * 60 /*minutes*/ * 60 /*seconds*/;
        birthPerYear = secondsPerYear / birthInterval;
        deathPerYear = secondsPerYear / deathInterval;
        migrationPerYear = secondsPerYear / migrationInverval;
        totalAddedPerYear = birthPerYear - deathPerYear + migrationPerYear;
        System.out.println("The starting Population is: " + startingPopulation);
        endingPopulation = startingPopulation + totalAddedPerYear;
        System.out.println("The population after one year is: " + endingPopulation);
        endingPopulation += totalAddedPerYear;
        System.out.println("The population after two years is: " + endingPopulation);
        endingPopulation += totalAddedPerYear;
        System.out.println("The population after three years is: " + endingPopulation);
        endingPopulation += totalAddedPerYear;
        System.out.println("The population after four years is: " + endingPopulation);
        endingPopulation += totalAddedPerYear;
        System.out.println("The population after five years is: " + endingPopulation);
    }
}