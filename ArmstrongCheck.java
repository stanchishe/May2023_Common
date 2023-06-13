import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();
        scanner.close();

        int originalNumber, remainder, result = 0;

        originalNumber = numberToCheck;

        while (numberToCheck != 0) {
            remainder = numberToCheck % 10;
            result += Math.pow(remainder, 3);
            numberToCheck /= 10;
        }

        if (result == originalNumber) {
            System.out.println("The number " + originalNumber + " is an armstrong number!");
        } else {
            System.out.println("The number " + originalNumber + " is not an armstrong number!");
        }
    }
}
