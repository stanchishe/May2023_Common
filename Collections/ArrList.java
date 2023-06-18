package Collections;

import java.util.ArrayList;
import java.util.Iterator;

class Pet {
    int age;
    String name;
}

public class ArrList {
    public static void main(String[] args) {

        // Array list to store Strings
        ArrayList<String> stringsArrList = new ArrayList<>();

        // Array list to store Objects
        ArrayList objectsArrList = new ArrayList();


        stringsArrList.add("Mark");
        stringsArrList.add("John");
        stringsArrList.add("Ann");
        stringsArrList.add("Steve");
        stringsArrList.add("Cookies");
        stringsArrList.add("Kirk");

        // Invalid operation, can only add Strings!
        // stringsArrList.add(5);
        // stringsArrList.add(true);


        // Print the entire arr list
        System.out.println("The string array contains " + stringsArrList);

        // Check the str arr list size
        System.out.println(stringsArrList.size());
        // Get the value at index 1
        System.out.println(stringsArrList.get(1));
        // Replace value at index 1
        stringsArrList.set(1, "Andrew");
        // Get the value at index 1
        System.out.println(stringsArrList.get(1));
        // Remove the value at index 1
        stringsArrList.remove(1);
        // Get the new value at index 1
        System.out.println(stringsArrList.get(1));
        // Print the arr list size again
        System.out.println(stringsArrList.size());

        // Iterate in array list
        System.out.println("++++++ Iterate with For loop ++++++");
        for (int i = 0; i < stringsArrList.size(); i++) {
            System.out.println(stringsArrList.get(i));
        }

        System.out.println("+++++++++ Iterate using While loop +++++++++");
        Iterator<String> iterator = stringsArrList.iterator();
        while (iterator.hasNext()) {
            String str = iterator.next();
            System.out.println(str);
            if(str.equalsIgnoreCase("Cookies")){
                iterator.remove();
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++");
        System.out.println("After the While loop the values are " + stringsArrList);

        Pet petOne = new Pet();
        petOne.age = 7;
        petOne.name = "dogOne";
        objectsArrList.add("Mark");
        objectsArrList.add(true);
        objectsArrList.add(5);
        objectsArrList.add(petOne);

        System.out.println("The string array contains " + objectsArrList);

        Object receive0dObj = objectsArrList.get(0);
        Object received1Obj = objectsArrList.get(1);
        Object received2Obj = objectsArrList.get(2);
        Object received3Obj = objectsArrList.get(3);

        System.out.println(received3Obj);
    }
}
