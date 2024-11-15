package org.example.week5.Lectures.Polymorphism.items;

public class CD implements Item{
    private String title;
    private int year;

    public CD(String title, int year) {
        this.title = title;
        this.year = year;
    }

    @Override
    public String getBarcode() {
        return "CD";
    }
}
