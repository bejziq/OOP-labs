package org.example.week5.Lectures.Practice;


import java.awt.font.TextHitInfo;
import java.util.ArrayList;

// EXAMPLE OF INTERFACES
public interface Readable {
    String read(); // declares a method read() without defining how it works
}

// SMS Class implements readable

class SMS implements Readable {
    private String content;

    public SMS(String content) {
        this.content = content;
    }

    @Override
    public String read() {
        return "SMS: " + this.content;
    }
}

class EBook implements Readable {
    private String title;
    private ArrayList<String> pages;
    private int pageNumber;

    public EBook(String title) {
        this.title = title;
        this.pageNumber = 0;
    }

    public String getTitle() {
        return this.title;
    }

    public int numOfPages() {
        return this.pages.size();
    }

    private void nextPage() {
        this.pageNumber = this.pageNumber + 1;
        if (this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }

    @Override
    public String  read() {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }


    public static void main(String[] args) {
        SMS sms = new SMS("bla bla bla");
        System.out.println(sms.read());


        ArrayList<String> pages = new ArrayList<String>();
        pages.add("Split your method into short clear chunks.");
        pages.add("Devide the user interface logic from the application logic.");
        pages.add("At first, always code only a small program which solves only a part of the problem.");
        pages.add("Practice makes perfect. Make up your own fun project.");

        EBook book = new EBook("Programming Hints.");
        for (int page = 0; page < book.numOfPages(); page++) {
            System.out.println(book.read());
        }

        ArrayList<String> bookPages = new ArrayList<>();
        bookPages.add("this is the first page");
        bookPages.add("this is the second page");

    }

}