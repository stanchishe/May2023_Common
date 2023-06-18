package Strings;

import java.util.Formatter;

public class StringExamples {
    public static void main(String[] args) {
        String nameOfTheFirstSuspect = "           The big bear!                 ".trim();
        String nameOfTheSecondSuspect = "The big bear";
        // nameOfTheSecondSuspect = nameOfTheSecondSuspect + "!";
        nameOfTheSecondSuspect += " " + "!";

        System.out.println(nameOfTheFirstSuspect);
        System.out.println(nameOfTheSecondSuspect);
        String someOtherName = new String("The big bear!");
        someOtherName = someOtherName.concat(" ").concat("He is a brown bear").concat("!");
        System.out.println(someOtherName);

        // ==
        if(nameOfTheFirstSuspect == nameOfTheSecondSuspect) {
            System.out.println("The strings are ==, what a surprise! ");
        }

        // .equals
        if(nameOfTheFirstSuspect.equalsIgnoreCase(nameOfTheSecondSuspect)) {
            System.out.println("The strings are .equalsIgnoreCase(), what a surprise! ");
        }
        if(!nameOfTheFirstSuspect.equals(nameOfTheSecondSuspect)) {
            System.out.println("The strings are not .equals()");
        }

        String myString = "I am an Englishman in New York";
        System.out.println(myString.length());

        System.out.println(myString.lastIndexOf("am"));

        String expectedStartString = "I am";
        if(myString.startsWith(expectedStartString)) {
            System.out.println("The string starts with '" + expectedStartString + "'");
        }

        String expectedEndString = "york";
        if(myString.endsWith(expectedEndString)) {
            System.out.println("The string ends with '" + expectedEndString + "'");
        } else {
            System.out.println("The string does not ends with '" + expectedEndString + "'");
        }

        String subString = "an Eng";
        if(myString.contains(subString)) {
            System.out.println("The substring was found!");
        }

        System.out.println(myString.substring(8));
        System.out.println(myString.substring(8, 11));

        System.out.println(myString.isEmpty());

        String replacedString = myString.replaceFirst("an", "ZY");
        System.out.println(replacedString);

        String[] myArr = myString.split("\\s");
        System.out.println(myArr[3]);

        System.out.println(myString.toLowerCase());
        System.out.println(myString.toUpperCase());

        Formatter formatter = new Formatter();
        formatter.format("I am a %d%% year old an Englishman in New York year old" +
                " an Englishman in New York year old an Englishman in New York year old an Englishman in New York", 45);
        System.out.println(formatter);

        System.out.println(String.format("The name of the agent is %s and he is %d years old.","John Show", 35));

        System.out.println("The School at the \\\\ end of the street is\n\"J.R.R. Tolkien\"");
    }

    public static class StringBuilderExample {
        public static void main(String[] args) {
            String stringOne = "EVIL STAR";
            StringBuilder stringTwo = new StringBuilder("EVIL STAR");

            String reverseString = "";
            for(int i = stringOne.length(); i > 0; i--) {
                reverseString += stringOne.charAt(i-1);
            }

            System.out.println(reverseString);
            System.out.println(stringTwo.reverse());
        }
    }
}
