package org.example.week6.Lectures.Generics;


// problem with multiple classes

class IntegerPrinter {
    private int value;

    public IntegerPrinter(int value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(this.value);
    }
}

class DoublePrinter {
    private double value;

    public DoublePrinter(double value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(this.value);
    }
}

class StringPrinter {
    private String value;

    public StringPrinter(String value) {
        this.value = value;
    }

    public void printValue() {
        System.out.println(this.value);
    }
}

// solution by using generics / templates

class Printer<T> {
    private T value;

    public Printer(T value) {
        this.value = value;
    }

    public void print() {
        System.out.println("printing the thing " + value);
    }
}

class Main {
    public static void main(String[] args) {
        Printer<String> stringPrinter = new Printer<>("imran");
        stringPrinter.print();
    }
}
