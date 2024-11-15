package org.example.week5.Lectures.Interface;

public class Book implements Item{
    private String tile;
    private int year;

    public Book(String tile, int year) {
        this.tile = tile;
        this.year = year;
    }

    @Override
    public String getBarCode() {
        return "BOOK";
    }
}
