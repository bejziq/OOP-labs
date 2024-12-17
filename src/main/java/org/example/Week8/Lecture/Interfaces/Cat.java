package org.example.Week8.Lecture.Interfaces;

interface Printable {
    public void print();
}

class Cat implements Printable{
    private String name;
    private int age;

    public Cat() {};

    public void print() {
        System.out.println("I am cat");
    }
}

class MainRun {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.print(); // I am cat

        printThing(cat); // I am cat

        Printable printable = () -> System.out.println("I am something printable");
        printThing(printable); // I am something printable
    }

    public static void printThing(Printable thing) {
        thing.print();
    }
}
