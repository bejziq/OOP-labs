package org.example.week3.Lecture;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture {
    public static void main(String[] args) {
        // Integers are "just values", they can be printed on screen and can be used for calculations
        // Strings are a bit more clever, they are objects. Objects can have methods, for example String have .length() method, and many others

        String word1 = "Programming";
        String word2 = "Java";

        System.out.println("String " + word1 + " length: " + word1.length()); // .length() method is used
        System.out.println("String " + word2 + " length: " + word2.length());

        // there are two ways to create a string in Java
        String banana = new String("banana"); // first way
        String carrot = "carrot"; // second way


        // ARRAY LIST
        ArrayList<String> wordList = new ArrayList<String>();
        wordList.add("first");
        wordList.add("second");
        System.out.println(wordList); // output: [first, second]

        ArrayList<String> teachers = new ArrayList<>();
        teachers.add("Becir");
        teachers.add("Mirza");
        teachers.add("Benjamin");

        System.out.println("the number of theacher: " + teachers.size()); // .size() method used to return number of elements in the arraylist

        System.out.println("first teacher on the list: " + teachers.get(0)); // .get(index) - returns element on the index

        teachers.remove("Mirza"); // first way
        // teachers.remove(1); // second way
        System.out.println(teachers);

        if (teachers.contains("Mirza")){
            System.out.println("Mirza is on teachers list");
        }
        else{
            System.out.println("Mirza is not on teachers list");
        }

        int place = 0;
        System.out.println(teachers.get(place));
        place++;
        System.out.println(teachers.get(place));

        System.out.println("-------------------");

        teachers.add("Dino");
        teachers.add("Lejla");
        teachers.add("Nedim");

        // looping through array list
        /*
        int pos = 0;
        while (place < teachers.size()){
            System.out.println(teachers.get(pos));
            pos++;
        }
        */

        // iterating through array list
        for (String teacher: teachers){
            System.out.println(teacher);
        }

        System.out.println("--------------");

        // ORDERING, REVERSING, SHUFFLING A LIST

        ArrayList<String> students = new ArrayList<>();
        students.add("Imran");
        students.add("Almin");
        students.add("Gasi");
        // Collections  class consists exclusively of static methods that operate on or return collections.
        // SORTING
        Collections.sort(students); // alphabetic ordering
        for (String student:  students){
            System.out.println(student);
        }

        // Numbers in array list
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(5);

        numbers.add(4);

        numbers.remove(Integer.valueOf(4));

        System.out.println(numbers);


    }


}
