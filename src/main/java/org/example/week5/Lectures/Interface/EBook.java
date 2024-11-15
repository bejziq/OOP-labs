package org.example.week5.Lectures.Interface;

import java.awt.font.TextHitInfo;
import java.util.ArrayList;

public class EBook implements Readable{
    private String name;
    private ArrayList<String> pages;
    private int pageNumber;

    public EBook(String name, ArrayList<String> pages) {
        this.name = name;
        this.pages = pages;
        this.pageNumber = 0;
    }

    public String getName() {
        return this.name;
    }

    public int numOfPages() {
        return this.pages.size();
    }

    @Override
    public String read() {
        String page = this.pages.get(this.pageNumber);
        nextPage();
        return page;
    }

    private void nextPage() {
        this.pageNumber = this.pageNumber + 1;
        if (this.pageNumber % this.pages.size() == 0) {
            this.pageNumber = 0;
        }
    }

}
