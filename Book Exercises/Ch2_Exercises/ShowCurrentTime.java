/*
ShowCurrentTime.java gives a program that displays the current time in GMP.  
Revise the program so that it prompts the user to enter the Time Zone
in hours away from GMT and display the time in the specified Time Zone.
*/

import java.util.Scanner;

public class ShowCurrentTime {
    public static void main(String[] args) {
      int timezone;
      Scanner input = new Scanner(System.in);

      System.out.println("Enter your time zone in hours away from GMT.");
      System.out.print("For example, if you are 5 hours before, enter '-5': ");
      timezone = input.nextInt();

      // Obtain the total milliseconds since midnight, Jan 1, 1970
      long totalMilliseconds = System.currentTimeMillis();
  
      // Obtain the total seconds since midnight, Jan 1, 1970
      long totalSeconds = totalMilliseconds / 1000;
  
      // Compute the current second in the minute in the hour
      long currentSecond = totalSeconds % 60;
  
      // Obtain the total minutes
      long totalMinutes = totalSeconds / 60;
  
      // Compute the current minute in the hour
      long currentMinute = totalMinutes % 60;
  
      // Obtain the total hours
      long totalHours = totalMinutes / 60;
  
      // Compute the current hour
      long currentHour = totalHours % 24 + timezone;

      if (currentHour < 0) {
        currentHour += 24;
      }
  
      // Display results
      System.out.println("Current time is " + currentHour + ":"
        + currentMinute + ":" + currentSecond + " " + timezone + " GMT.");
    }
  }