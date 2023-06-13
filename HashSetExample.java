import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();

        // Add data to the set

        set.add("John");
        set.add("Mark");
        set.add("Ann");
        set.add("Eve");
        set.add("Steve");
        set.add("Kirk");
        set.add("John");
        set.add("Mark");
        set.add("Maria");
        set.add("Kate");

        // The data is unique
        // The data is not sorted

        System.out.println(set);
        System.out.println(set.size());

        Iterator<String> iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        set.remove("John");
        System.out.println(set);
        System.out.println(set.size());

        if(set.contains("John")) {
            System.out.println("Hpw did we find John?!");
        } else {
            System.out.println("John was deleted!");
        }
    }
}
