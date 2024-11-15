package org.example.week5.Lectures.Practice;

// COMPILE TIME POLYMORPHISM (METHOD OVERLOADING)
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

// Run - Time Polymorphism (Method overriding)
class Animal {
    public void sound() {
        System.out.println("animal sound");
    }
}

class Dog extends Animal {
    @Override
    public void sound() {
        System.out.println("Bark");
    }
}