package org.example.Week11.Lectures.Exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Exceptions {
    // they are type of class Throwable
    // 2 types checked(handle during the coding) and unchecked(during the runtime we might get the exception)
    // finally executes no matter if exception is thrown or not, we will always get finally block of code executable

    public static void main(String[] args)  {
        System.out.println(getNumber());
    }


    public static void readFile() {

        try {
            BufferedReader reader = new BufferedReader(
                    new FileReader("imran.txt")
            );
        }
        catch (FileNotFoundException e) {
            System.out.println("Exception handled");
        }

    }

    public static int getNumber() {
        try {
            return 1;
        }
        catch (Exception e) {
            return 2;
        }
        finally {
            return 3;
        }
    }

}
