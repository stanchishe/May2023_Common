public class PrimeNumbersEx {
    public static void main(String[] args) {
        // One for loop to go through the numbers 1 - 100
        // Another for loop nested in the first one. Goes through the numbers 1 and current number.

        String primeNumbers = "";

        for (int i = 1; i <= 100; i++) {
            int counter = 0;
            for (int j = i; j >= 1; j--) {
                if(i%j==0) {
                    counter++;
                }
            }
            if(counter <= 2) {
                primeNumbers += i + " ";
            }
        }

        System.out.println(primeNumbers);
    }
}
