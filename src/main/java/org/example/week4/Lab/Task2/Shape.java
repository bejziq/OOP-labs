package org.example.week4.Lab.Task2;

enum FilLType{
    FILLED, NOT_FILLED
}

public class Shape {
    private String color;
    private FilLType filled;

    public Shape(String color, FilLType filled) {
        this.color = color;
        this.filled = filled;
    }

    public void displayInfo() {
        System.out.println("Color: " + color);
        System.out.println("Filled: " + (filled == FilLType.FILLED ? "Yes" : "No"));
    }

}
