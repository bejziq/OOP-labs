package org.example.week3.Lecture;

import java.util.ArrayList;

public class Lecture2 {

    public static void print(ArrayList<String> list){
        for (String word : list){
            System.out.println(word);
        }
    }


    public static void main(String[] args) {
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C++");
        programmingLanguages.add("Python");

        ArrayList<String> countries = new ArrayList<>();
        countries.add("India");
        countries.add("US");
        countries.add("Germany");

        print(programmingLanguages);
        System.out.println("--------------------");
        print(countries);
    }


}
