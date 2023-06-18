package ConditionalLogic;

import java.util.Scanner;

public class IfElseLogic {
    public static void main(String[] args) {
        // Creates an input tracker, to watch for input from the command line
        Scanner input = new Scanner(System.in);
        // Gets an integer from the command line and assigns it to 'a'
        System.out.println("Enter a number different than 0!");
        int a = input.nextInt();

        // Close the scanner
        input.close();

        // Calculate the remainder
        int remainder = a % 2;

        if (remainder == 0) {
            System.out.println("The number: " + a + " is even!");
        } else {
            System.out.println("The number " + a + " is odd!");
        }
        System.out.println("We are out!");
    }
}
