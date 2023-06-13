import java.util.LinkedList;
import java.util.Queue;

public class CarsQueue {
    public static void main(String[] args) {
        //First in, first out!
        Queue<String> carsQueue = new LinkedList<>();

        carsQueue.add("Skoda");
        carsQueue.add("Lada");
        carsQueue.add("ZAZ");
        carsQueue.add("Volga");


        // Demonstrate peek()
        System.out.println(carsQueue.peek());
        System.out.println(carsQueue);

        // Demonstrate poll()
        System.out.println(carsQueue.poll());
        System.out.println(carsQueue);

        // Demonstrate excessive peek()
        System.out.println(carsQueue.poll());
        System.out.println(carsQueue.poll());
        System.out.println(carsQueue.poll());
        System.out.println(carsQueue.poll());
        System.out.println(carsQueue);

        carsQueue.add("Skoda");
        System.out.println(carsQueue);

        carsQueue.remove("BMW");
        System.out.println(carsQueue);

        carsQueue.remove("Skoda");
        System.out.println(carsQueue);
    }
}
