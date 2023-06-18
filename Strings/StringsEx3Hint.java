package Strings;

public class StringsEx3Hint {
    public static void main(String[] args) {
        String completeString = "Maggie is an engineer. Gilbert is an artist";
        String subString = "gi";
        int lastIndex = 0;
        int count = 0;
        while (lastIndex != -1) {
            System.out.println(completeString.indexOf(subString, lastIndex));
            lastIndex = completeString.indexOf(subString, 20);
        }
    }
}
