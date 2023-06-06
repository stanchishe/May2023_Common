public class BreakStatementExample {
    public static void main(String[] args) {
        int numOfFloors = 5;
        int numOfApts = 7;

        for (int i = 1; i <= numOfFloors; i++) {
            for (int j = 1; j <= numOfApts; j++) {
                System.out.println("We are in apartment " + j + " on floor number " + i);

                if(i == 3 && j == 3) {
                    System.out.println("Break reached!");
                    // We exit the nested loop in the 3rd app of the 3rd floor, and we continue to the next floor.
                    break;
                }
            }
        }
    }
}
