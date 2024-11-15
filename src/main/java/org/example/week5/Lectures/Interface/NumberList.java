package org.example.week5.Lectures.Interface;


// An Interface As A Method Parameter

import java.util.ArrayList;

public class NumberList implements Readable{

    private ArrayList<Readable> readables;

    public NumberList() {
        this.readables = new ArrayList<>();
    }

    public void add (Readable readable) {
        this.readables.add(readable);
    }

    @Override
    public String read() {
        String read = "";

        for (Readable readable : this.readables) {
            read += readable.read() + "\n";
        }

        this.readables.clear();
        return read;
    }


    public int howManyReadables() {
        return this.readables.size();
    }

    public static void main(String[] args) {
        NumberList joelList = new NumberList();
        joelList.add(new SMS("matti", "exams are next week"));
        joelList.add(new SMS("matti", "are you ready?"));

        System.out.println("Joel has   " + joelList.howManyReadables() + " messages to read"    );
    }
}
