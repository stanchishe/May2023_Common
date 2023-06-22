package Exceptions;

public class AssertExample {
    public static void main(String[] args) {
        System.out.println("Starting the example!");
        int x = 1;
        // DIDNT WORK, WE ARE ALL SAD!
        assert (x % 2 == 0);
    }
}
