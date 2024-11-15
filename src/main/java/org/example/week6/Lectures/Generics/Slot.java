package org.example.week6.Lectures.Generics;

public class Slot <T>{
    private T key;

    public void setValue(T key) {
        this.key = key;
    }

    public T getValue() {
        return key;
    }

    public static void main(String[] args) {
        Slot<String> string = new Slot<>();
        string.setValue(":)");

        System.out.println(string.getValue());
    }
}
