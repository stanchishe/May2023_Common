package Intro;

public class MyFirstJavaClass {
    static int a = 11;
    public static void main(String[] args) {
        System.out.println("The globals value of a is " + a);
        int a = 5;
        int b = 7;
        int c = a + b;
        System.out.println("The sum of " + a + " + " + b + " is " + c);

        int d = 10;
        c = b + d;
        System.out.println("The sum of " + d + " + " + b + " is " + c);

        boolean bool = false;


        int remainder = a % b;
        System.out.println("The remainder of a % b is " + remainder);

        a--;
        System.out.println(a);

        a %= 5;
        System.out.println(a);
    }
}
