public class GenericArraysExamples {
    public static void main(String[] args) {
        String[] carsOne = {"Audi", "Lada", "Skoda", ""};

        carsOne[3] = "VW";
        System.out.println(carsOne[3]);

        carsOne[1] += " KIA";
        System.out.println(carsOne[1]);

        String tempStorage = carsOne[0];
        carsOne[0] = carsOne[2];
        carsOne[2] = tempStorage;

        System.out.println("-----------------------");
        System.out.println(carsOne[0]);
        System.out.println(carsOne[2]);


//        String[] carsTwo = new String[carsOne.length];
//        for(int i = 0; i < carsTwo.length; i++ ) {
//            carsTwo[i] = carsOne[i];
//        }

        String[] carsTwo = carsOne;
    }
}
