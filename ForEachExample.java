public class ForEachExample {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        int carsArrLength = cars.length;

        System.out.println("The length of the cars array is " + carsArrLength);
        // Last index of an array = array.length - 1

        for (int i = 0; i < carsArrLength; i++) {
            System.out.println(cars[i]);
        }

        System.out.println("Enhanced for-loop print:");
        for (String carName : cars) {
            System.out.println(carName);
        }
    }
}
