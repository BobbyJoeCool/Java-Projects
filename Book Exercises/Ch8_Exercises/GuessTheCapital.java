/* 
(Guess the capitals) Write a program that repeatedly prompts the user to enter a capital for a state. Upon receiving the user input, the program reports whether the answer is correct. Assume that 50 states and their capitals are stored in a two-dimensional array, as shown in Figure 8.10. The program prompts the user to answer all states’ capitals and displays the total correct count. The user’s answer is not case-sensitive.
*/

import java.util.Random;
import java.util.Scanner;

public class GuessTheCapital {
    public static void main(String[] args) {
        String[][] statesAndCapitals = {
            {"Alabama", "Montgomery"},
            {"Alaska", "Juneau"},
            {"Arizona", "Phoenix"},
            {"Arkansas", "Little Rock"},
            {"California", "Sacramento"},
            {"Colorado", "Denver"},
            {"Connecticut", "Hartford"},
            {"Delaware", "Dover"},
            {"Florida", "Tallahassee"},
            {"Georgia", "Atlanta"},
            {"Hawaii", "Honolulu"},
            {"Idaho", "Boise"},
            {"Illinois", "Springfield"},
            {"Indiana", "Indianapolis"},
            {"Iowa", "Des Moines"},
            {"Kansas", "Topeka"},
            {"Kentucky", "Frankfort"},
            {"Louisiana", "Baton Rouge"},
            {"Maine", "Augusta"},
            {"Maryland", "Annapolis"},
            {"Massachusetts", "Boston"},
            {"Michigan", "Lansing"},
            {"Minnesota", "Saint Paul"},
            {"Mississippi", "Jackson"},
            {"Missouri", "Jefferson City"},
            {"Montana", "Helena"},
            {"Nebraska", "Lincoln"},
            {"Nevada", "Carson City"},
            {"New Hampshire", "Concord"},
            {"New Jersey", "Trenton"},
            {"New Mexico", "Santa Fe"},
            {"New York", "Albany"},
            {"North Carolina", "Raleigh"},
            {"North Dakota", "Bismarck"},
            {"Ohio", "Columbus"},
            {"Oklahoma", "Oklahoma City"},
            {"Oregon", "Salem"},
            {"Pennsylvania", "Harrisburg"},
            {"Rhode Island", "Providence"},
            {"South Carolina", "Columbia"},
            {"South Dakota", "Pierre"},
            {"Tennessee", "Nashville"},
            {"Texas", "Austin"},
            {"Utah", "Salt Lake City"},
            {"Vermont", "Montpelier"},
            {"Virginia", "Richmond"},
            {"Washington", "Olympia"},
            {"West Virginia", "Charleston"},
            {"Wisconsin", "Madison"},
            {"Wyoming", "Cheyenne"}
        };
        
        Random rng = new Random();
        Scanner input = new Scanner(System.in);

        while (true) { 
            int rInt = rng.nextInt(50);
            String randomState = statesAndCapitals[rInt][0];
            String randomCapital = statesAndCapitals[rInt][1];
            
            System.out.println("The random state chosen is " + randomState);
            System.out.print("What is the capital? ");
            String answer = input.nextLine();

            if (answer.equalsIgnoreCase(randomCapital)) {
                System.out.println("That is correct!");
            } else {
                System.out.println("Incorrect, the correct answer is: " + randomCapital);
            }

            System.out.print("Would you like to try another? (enter Y/N): ");
            String again = input.nextLine();
            if (!again.trim().toLowerCase().startsWith("y")) {
                break;
            }

        }
    }
}
