package Debugger;

public class DebuggerOne {
    public static void main(String[] args) {
        int a = 9;
        int b = 11;
        System.out.print("The total of " + a + " + " + b);
        int total = sum(a, b);

        System.out.print(" is: " + total);
        System.out.println("");

        int sub = SubMath.sub(b, a);
        System.out.println(sub);

        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }

    }

    private static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

class SubMath {
    public static int sub(int a, int b) {
        int sub = a - b;
        return sub;
    }
}
