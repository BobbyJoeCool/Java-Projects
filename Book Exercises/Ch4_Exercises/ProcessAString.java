/*
Write a program that prompts the user to enter a string and displays its length and its first character.
*/

import java.util.Scanner;

public class ProcessAString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter a word or phrase: ");
        String userInput = input.nextLine();

        int inputLength = userInput.length();
        char inputFirstChar = userInput.charAt(0);

        System.out.println("Your input is " + inputLength + " characters long and the first character is " + inputFirstChar);

        input.close();
    }
}
