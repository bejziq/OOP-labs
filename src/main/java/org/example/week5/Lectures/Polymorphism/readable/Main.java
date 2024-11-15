package org.example.week5.Lectures.Polymorphism.readable;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook book = new EBook("Programming Hints.", pages);
        for (int page = 0; page < book.numOfPages(); page++) {
            System.out.println(book.read());
        }

        ArrayList<String> bookPages = new ArrayList<>();
        bookPages.add("this is the first page");
        bookPages.add("this is the second page");

        SMS sms = new SMS("becir", "hello");
        System.out.println(sms.read());

        ArrayList<SMS> messages = new ArrayList<>();
        messages.add(new SMS("NA", "I am learning oop"));

    }
}
