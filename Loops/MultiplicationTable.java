package Loops;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an integer!!");
        int a = scanner.nextInt();
        scanner.close();

        for (int i = 1; i <= a; i++) {
            int result = i * a;
            System.out.println(i + " X " + a + " = " + result);
        }
        System.out.println("End of table!");
    }
}
