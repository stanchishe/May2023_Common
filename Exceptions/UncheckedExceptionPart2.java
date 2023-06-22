package Exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UncheckedExceptionPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a, b;
        try {
            System.out.println("Provide number you want to divide:");
            a = scanner.nextInt();
            System.out.println("Provide number you want to divide by:");
            b = scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input type! Integer was expected!");
            throw new RuntimeException(exception);
        }

        scanner.close();

        if (b == 0) {
            System.out.println("Cannot divide by Zero! Terminating!");
            return;
        }
        double result;
        try {
            result = a/b;
        } catch (ArithmeticException exception) {
            System.out.println("Something went wrong!");
            throw new RuntimeException(exception);
        }
        System.out.println(result);
    }
}
