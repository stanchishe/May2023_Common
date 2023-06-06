public class DoWhileLoopExample {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }
        System.out.println("Out of the first while loop!");
//        while (i <= 10) {
//            System.out.println(i);
//            i++;
//        }
//        System.out.println("Out of the second while loop!");
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
        System.out.println("Out of the do-while loop!");
    }
}
