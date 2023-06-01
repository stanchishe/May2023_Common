import java.util.Scanner;

public class IfLogic {
    public static void main(String[] args) {
        // Creates an input tracker, to watch for input from the command line
        Scanner input = new Scanner(System.in);
        // Gets an integer from the command line and assigns it to 'a'
        System.out.println("Enter a number!");
        int a = input.nextInt();

        // Close the scanner
        input.close();

        // Check of the number is positive
        // (condition) => boolean
        if (a > 0) {
            System.out.println("The number: " + a + " was positive");
        }
        System.out.println("We are out!");
    }
}
