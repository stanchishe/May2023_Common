package OOP_part1;

public class MethodOverload {
    public static void main(String[] args) {
        int sumOne = sum(5, 11);
        System.out.println(sumOne);

        double sumTwo = sum(5.1, 10);
        System.out.println(sumTwo);

        double sumThree = sum(5.2, 6.4);
        System.out.println(sumThree);

        double sumFour = sum(5.2, 6.4, 10);
        System.out.println(sumFour);
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double a, int b) {
        return a + b;
    }

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double sum(double a, double b, double c) {
        return a + b + c;
    }
}
