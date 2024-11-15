package org.example.week6.Lectures.Generics;

public class MultiplePrinter <T,E>{
    private T value;
    private E anything;

    public MultiplePrinter(T value, E anything) {
        this.value = value;
        this.anything = anything;
    }

    public void print() {
        System.out.println("printing the multi thing: " + value + " and " + anything);
    }
}
