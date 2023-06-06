import java.util.Scanner;

public class SumOnce {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = "";
        do {
            System.out.println("Enter the first integer to be summed:");
            int a = scanner.nextInt();
            System.out.println("Enter the second integer to be summed:");
            int b = scanner.nextInt();
            int sum = a + b;
            System.out.println("The sum if the integers you entered is: " + sum + "!");

            System.out.println("Would you like to try that again? Enter 'Yes' to confirm.");
            answer = scanner.next();
        } while (answer.equalsIgnoreCase("Yes"));
        scanner.close();

        System.out.println("No more additions will be performed! Bye!");
    }
}
