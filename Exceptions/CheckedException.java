package Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class CheckedException {
    public static void main(String[] args) {
        System.out.println("Attempting to read a text file!");

        boolean fileRead = readFileOne();
        // If file now found, offer the user to change the file name / file path

        if(fileRead) {
            System.out.println("Adding some text to the file");
        } else {
            System.out.println("The file could not be read, terminating! ");
        }

        try {
            readFileTwo();
        } catch (FileNotFoundException e) {
            System.out.println("The second file could not be read!");
        } finally {
            System.out.println("FileTwo reading complete!");
        }

        System.out.println("Stopping to read files!");

    }

    public static boolean readFileOne() {
        try {
            FileInputStream fileInputStream = new FileInputStream("..\\Desktop\\newFileOne.txt");
        } catch (FileNotFoundException exception) {
            System.out.println("The first file could not be read!");
            return false;
            // throw new RuntimeException(exception);
        } finally {
            System.out.println("FileOne reading complete!");
        }
        return true;
    }

    public static void readFileTwo() throws FileNotFoundException {
        FileInputStream fileInputStream = new FileInputStream("..\\Desktop\\newFileTwo.txt");
    }
}
