package OOP_part2.Interface;

import java.util.ArrayList;
import java.util.Collections;

public class Apple
    implements Comparable<Apple>
{
    private String variety;
    private String color;
    private int weight;

    public Apple (String variety, String color, int weight) {
        this.variety = variety;
        this.color = color;
        this.weight = weight;
    }

    public String getVariety() {
        return variety;
    }

    public String getColor() {
        return color;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Apple another) {
        int result = Integer.compare(this.weight, another.weight);
        if (result == 0) {
            result = this.color.compareTo(another.color);
        }
        if (result == 0) {
            result = this.variety.compareTo(another.variety);
        }
        return result;
    }
}

class AppleStart {
    public static void main(String[] args) {
        ArrayList<Integer> intArrList = new ArrayList<>();
        Collections.addAll(intArrList, 5, 20, 3, 7, 4, 15, 21, 99);

        System.out.println("First Integer array print:");
        for (Integer integer : intArrList) {
            System.out.println(integer);
        }
        Collections.sort(intArrList);
        System.out.println("Second Integer array print");
        for (Integer integer : intArrList) {
            System.out.println(integer);
        }

        ArrayList<Apple> applesArrayList = new ArrayList<>();

        Apple appleOne = new Apple("Sweet Tango", "Red", 157);
        Apple appleTwo = new Apple("Gala", "Red", 168);
        Apple appleThree = new Apple("Pazazz", "Red and Yellow", 162);
        Apple appleFour = new Apple("Granny Smith", "Green", 151);
        Apple appleFive = new Apple("Golden Delicious", "Yellow", 151);

        Collections.addAll(applesArrayList, appleOne, appleTwo, appleThree, appleFour, appleFive);
        System.out.println("First apples print: ");
        for (Apple apple : applesArrayList) {
            System.out.println(apple.getVariety() + " " + apple.getColor() + " " + apple.getWeight());
        }

        Collections.sort(applesArrayList);
        System.out.println("Second apples print: ");
        for (Apple apple : applesArrayList) {
            System.out.println(apple.getVariety() + " " + apple.getColor() + " " + apple.getWeight());
        }
    }
}
