package ConditionalLogic;

import java.util.Scanner;

public class IfElseIfLogic {
    public static void main(String[] args) {
        // Creates an input tracker, to watch for input from the command line
        Scanner input = new Scanner(System.in);
        // Gets an integer from the command line and assigns it to 'a'
        System.out.println("Enter a number!");
        int a = input.nextInt();

        // Close the scanner
        input.close();

        // Calculate the remainder
        int remainder = a % 2;

        if (a == 0) {
            System.out.println("The number: " + a + " is zero!");
            //Spam it some more!
            System.out.println("The number: " + a + " is zero!");
            System.out.println("The number: " + a + " is zero!");
            System.out.println("The number: " + a + " is zero!");
            System.out.println("The number: " + a + " is zero!");
            System.out.println("The number: " + a + " is zero!");
        } else if (remainder == 1) {
            System.out.println("The number: " + a + " is odd!");
        } else if (remainder == 0) {
            System.out.println("The number: " + a + " is even!");
        } else {
            System.out.println("This is not possible!");
        }
        System.out.println("We are out!");
    }
}
