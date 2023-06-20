package OOP_part2.Inheritance;

public class MathExample {
    public static void main(String[] args) {
        double basicAdd = MathSuperAdvanced.add(5,15);
        System.out.println(basicAdd);

        double basicSub = MathSuperAdvanced.sub(17, 11.1);
        System.out.println(basicSub);

        double basicMulti = MathSuperAdvanced.multi(11, 11);
        System.out.println( basicMulti);

        double basicDivide = MathSuperAdvanced.divide(264, 8);
        System.out.println(basicDivide);
    }
}

class MathBasic {
    public static double add(double a, double b) {
        return a + b;
    }
}

class MathIntermediate extends MathBasic {
    public static double sub(double a, double b) {
        return a - b;
    }
}

class MathAdvanced extends MathIntermediate {
    public static double multi(double a, double b) {
        return a * b;
    }
}

class MathSuperAdvanced extends MathAdvanced {
    public static double divide(double a, double b) {
        return  a / b;
    }
}
