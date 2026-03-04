/* 
Write a program that prompts the user to enter a hex digit and displays its corresponding binary number in four digits. For example, hex digit 7 is 0111 in binary. Hex digits can be entered either in uppercase or lowercase. For an incorrect input, display invalid input.

*/

import java.util.Scanner;

public class HexToBinary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a hex digit 0-9, A-F: ");
        String hexDigit = input.next();

        if (hexDigit.length() != 1) {
            System.out.println("Invalid Input");
            input.close();
            return;
        }

        char ch = hexDigit.charAt(0);
        int value;

        if (ch >= '0' && ch <= '9') {
            value = ch - '0';
        } else if (ch >= 'A' && ch <= 'F') {
            value = ch - 'A' + 10;
        } else if (ch >= 'a' && ch <= 'f') {
            value = ch - 'a' + 10;
        } else {
            System.out.println("Invalid input");
            return;
        }

        System.out.print("The hex digit " + hexDigit + " can be written as ");

        System.out.print((value & 8) >> 3);
        System.out.print((value & 4) >> 2);
        System.out.print((value & 2) >> 1);
        System.out.print(value & 1);

        System.out.println(" in binary.");

        input.close();
    }
}
