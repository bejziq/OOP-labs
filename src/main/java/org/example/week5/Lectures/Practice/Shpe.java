package org.example.week5.Lectures.Practice;


// Abstract class example
abstract class Shpe {
    public abstract double area();
}

class Circle extends Shpe {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }
}

