package org.example.week3.Lecture;

import java.util.Random;

public class Randomitics {
    public static void main(String[] args) {
        Random randomizer = new Random();

        int i = 0;

        while (i < 10){
            System.out.println(randomizer.nextInt(10));
            i++;
        }
    }

}
