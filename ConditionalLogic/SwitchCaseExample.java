package ConditionalLogic;

import java.util.Scanner;

public class SwitchCaseExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the participants place!");
        int a = input.nextInt();

        // Close the scanner
        input.close();

        String medal = "";
        switch (a) {
            case 1:
                medal = "Gold";
                System.out.println(medal);
                break;
            case 2:
                medal = "Silver";
                System.out.println(medal);
                break;
            case 3:
                medal = "Bronze";
                System.out.println(medal);
                break;
            default:
                medal = "None";
        }

        System.out.println("The participant gets a " + medal + " medal");
    }
}
