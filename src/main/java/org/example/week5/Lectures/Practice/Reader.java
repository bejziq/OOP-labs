package org.example.week5.Lectures.Practice;

import java.util.List;

public class Reader {
    public void displayContent(Readable readable) {
        System.out.println(readable.read());
    }

    public static void main(String[] args) {
        Reader reader = new Reader();
        SMS sms = new SMS("Hello from SMS");
        EBook ebook = new EBook("Java programming");

        reader.displayContent(sms);
        reader.displayContent(ebook);
    }
}
