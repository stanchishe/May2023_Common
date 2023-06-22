package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedException {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer[] intArr = new Integer[5];
        int numberToAdd;
        int arrIndex;

        System.out.println("Enter the number you want to add!");
        try {
            numberToAdd = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input type!");
            throw new RuntimeException(exception);
        }

        System.out.println("Enter where you would like to add it!");
        try {
            arrIndex = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input type!");
            throw new RuntimeException(exception);
        }

        scanner.close();

        if (arrIndex < 0 || arrIndex >= 5) {
            System.out.println("Cannot add to the provided index! The arrays index starts at 0 and ends at 4!");
        } else {
            intArr[arrIndex] = numberToAdd;
        }
    }
}
