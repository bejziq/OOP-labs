package org.example.Week11.Lectures.Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

class CheckedExample {
    public static void main(String[] args) {
            try {
                FileReader reader = new FileReader("file.txt");
                System.out.println("file opened successfully");
            } catch (FileNotFoundException e) {
                System.out.println("file not found " + e.getMessage());
            }
    }
}


class CheckedThrowsExample {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader reader = new FileReader("fajl.txt");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileReader reader = new FileReader(fileName);
    }
}