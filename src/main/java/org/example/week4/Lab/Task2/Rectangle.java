package org.example.week4.Lab.Task2;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, FilLType filled, double width, double height) {
        super(color, filled);
        this.width = width;
        this.height = height;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Width: " + this.width);
        System.out.println("Height: " + this.height);
    }

    public void getArea() {
        System.out.println(this.width * this.height);
    }
}
