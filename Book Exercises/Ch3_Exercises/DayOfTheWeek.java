/* 
Zeller’s congruence is an algorithm developed by Christian Zeller to calculate the day of the week. The formula is

h=(q+26(m+1)/10+k+k/4+j/4+5j)%7

where:
    h is the day of the week (0: Saturday, 1: Sunday, 2: Monday, 3: Tuesday, 4: Wednesday, 5: Thursday, and 6: Friday).
    q is the day of the month.
    m is the month (3: March, 4: April, ..., 12: December). January and February are counted as months 13 and 14 of the previous year.
    j is year / 100.
    k is the year of the century (i.e., year % 100).
Note all divisions in this exercise perform an integer division. Write a program that prompts the user to enter a year, month, and day of the month, and displays the name of the day of the week.
Hint: January and February are counted as 13 and 14 in the formula, so you need to convert the user input 1 to 13 and 2 to 14 for the month and change the year to the previous year. For example, if the user enters 1 for m and 2015 for year, m will be 13 and year will be 2014 used in the formula.)
*/

import java.util.Scanner;

public class DayOfTheWeek {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("This program will tell you the day of the week given the Day, Month, and Year.\n");
        System.out.print("Enter the Date (24): ");
        int date = input.nextInt();
        System.out.print("Enter the month (1 for January, 2 for February...): ");
        int month = input.nextInt();
        System.out.print("Enter the year (2026): ");
        int year = input.nextInt();

        int maxDay, h, q, m, j, k, y = year; 

        if (month == 2) {
            boolean leap = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            maxDay = leap ? 29 : 28;
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            maxDay = 30;
        } else {
            maxDay = 31;
        }

        if (month < 1 || month > 12 || date < 1 || date > maxDay) {
            System.out.println("Invalid date.");
            System.exit(0);
        }


        if (month == 1 || month == 2) {
            m = month + 12;
            y --;
        } else {
            m = month;
        }

        q = date;
        j = y / 100;
        k = y % 100;
        

        h = (q + ( (26 * (m + 1)) / 10) + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String day;

        day = switch (h) {
            case 0 -> "Saturday";
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            default -> "Invalid day";
        };

        System.out.println(date + "/" + month + "/" + year + " is a " + day);

        input.close();
    }
}
