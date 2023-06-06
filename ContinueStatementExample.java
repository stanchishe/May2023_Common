public class ContinueStatementExample {
    public static void main(String[] args) {
        int numOfFloors = 5;
        int numOfApts = 7;

        for (int i = 1; i <= numOfFloors; i++) {
            for (int j = 1; j <= numOfApts; j++) {
                if(i == 3 && j == 3) {
                    System.out.println("Continue reached!");
                    continue;
                }
                System.out.println("We are in apartment " + j + " on floor number " + i);
            }
        }
    }
}
