package org.example.Week10.Lectures.Iterators;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("banana");
        fruits.add("manngo");
        fruits.add("apple");

        Iterator<String> iterator = fruits.iterator();

        while (iterator.hasNext()) { //  .hasnext() returns true if there are more elements in collection, false otherwise
            String fruit  = iterator.next(); // assign the element in array to fruit and in next line print it
            System.out.println(fruit); // print that element
        }
    }
}
