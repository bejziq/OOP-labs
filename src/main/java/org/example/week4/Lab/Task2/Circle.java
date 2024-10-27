package org.example.week4.Lab.Task2;

public class Circle extends Shape{
    private double radius;

    public Circle(String color, FilLType filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("radius:" + radius);
    }

    public void getArea() {
        System.out.println(Math.PI * radius * radius);
    }

    public double calculateCircumference(double PI, double r) {
        return 2 * PI * r;
    }

    public double calculateCircumference (double r) {
        return 2 * Math.PI * r;
    }


}
