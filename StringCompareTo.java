public class StringCompareTo {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "hello";
        String s3 = "zello";
        String s4 = "heelo";
        String s5 = "cookie";

        System.out.println(s1.compareTo(s2)); // 0, because they are equal
        System.out.println(s1.compareTo(s3)); // -18, because h is lower than z
        System.out.println(s1.compareTo(s4)); // 7
        System.out.println(s1.compareTo(s5)); // 5

    }
}
