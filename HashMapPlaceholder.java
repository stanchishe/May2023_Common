import java.util.HashMap;

public class HashMapPlaceholder {
    public static void main(String[] args) {
        HashMap<String, Integer> peopleAges = new HashMap<>();

        peopleAges.put("Mark", 29);
        peopleAges.put("Steve", 31);
        peopleAges.put("Ann", 28);
        peopleAges.put("John", 34);
        peopleAges.put("Mattew", 44);

        System.out.println(peopleAges);

        System.out.println(peopleAges.get("Mark"));

        System.out.println(peopleAges.containsKey("Ann"));
        System.out.println(peopleAges.containsValue(54));
    }
}
