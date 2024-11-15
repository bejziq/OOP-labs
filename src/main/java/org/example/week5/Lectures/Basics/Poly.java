package org.example.week5.Lectures.Basics;

import java.util.ArrayList;
import java.util.List;

public class Poly {
    public static void printManyTimes(Object object, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(object.toString());
        }
    }

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("polymorphism");
        words.add("abstraciton");
        words.add("encapsulation");
        words.add("inheritence");

        printManyTimes("Imran", 2);
        printManyTimes(words, 5);
    }
}

