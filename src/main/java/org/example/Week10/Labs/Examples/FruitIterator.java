package org.example.Week10.Labs.Examples;

import java.util.ArrayList;
import java.util.Arrays;

public class FruitIterator {

    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(Arrays.asList(
                "banana", "jabuka", "sljiva"
        ));

        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }


}
