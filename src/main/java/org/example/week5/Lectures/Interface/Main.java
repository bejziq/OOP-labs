package org.example.week5.Lectures.Interface;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(10,20);
        Measurable rectangle2 = new Rectangle(20, 30);
        Object rectangle3 = new Rectangle(100, 200);
       // System.out.println(rectangle2.getPerimeter());


        // SMS

        SMS sms = new SMS("Imran", "hello");
        System.out.println(sms.read()); // hello

        ArrayList<SMS> messages = new ArrayList<>();
        messages.add(new SMS("rejhan", "gdje si"));
        messages.add(new SMS("Almin", "evo me"));

        System.out.println(messages.toString());


        ArrayList<String> pages = new ArrayList<String>(); // lista stranica, svaka stranica sadrzi jednu recenicu
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook ebook = new EBook("Programming hints", pages);
        for(int page = 0; page < ebook.numOfPages(); page++) {
            System.out.println(ebook.read());
        }

        String string = "string - object";
        SMS message2 = new SMS("teacher", "something");

        SMS message3 = new SMS("Teacher", "awesome stuff");
        Readable readable = new SMS("TA", "this sms is readable");


        // Interface as a type

        ArrayList<Readable> numberList = new ArrayList<Readable>();
        numberList.add(new SMS("teacher", "never been programming before..."));
        numberList.add(new SMS("teacher", "gonna love it i think!"));
        numberList.add(new SMS("teacher", "give me something more challenging! :)"));
        numberList.add(new SMS("teacher", "you think i can do it?"));
        numberList.add(new SMS("teacher", "up here we send several messages each day"));

        ArrayList<String> bookPages = new ArrayList<>();

        bookPages.add("this is first page");
        bookPages.add("this is second page");

        numberList.add(new EBook("ime knjige", bookPages));

        for (Readable readable1 : numberList) {
            System.out.println(readable1);
        }


        CD cd = new CD("neki cd", 2022);
        Book book = new Book("neka knjiga", 2000);

        System.out.println(book.getBarCode());
    }
}
