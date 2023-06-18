package ConditionalLogic;

import java.util.Scanner;

public class ShortHandIfElse {
    public static void main(String[] args) {
        String myName = "Mark";

        Scanner input = new Scanner(System.in);

        System.out.println("Try to guess the name! Enter name:");
        String inputName = input.next();

        // Close the scanner
        input.close();

        boolean nameIsCorrect = (inputName.equals(myName)) ? true : false;

        if (nameIsCorrect) {
            System.out.println("The name is correct1");
        } else {
            System.out.println("The name is not correct!");
        }
        System.out.println("We are out!");
    }
}
