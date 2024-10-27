package org.example.week4.Lab.Task2;

public class Main {
    public static void main(String[] args) {
        Circle krug = new Circle("black", FilLType.NOT_FILLED, 2.3);
        krug.displayInfo();
        krug.getArea();

        System.out.println("**************************************");

        Rectangle pravougaonik = new Rectangle("Red", FilLType.FILLED, 20, 40);
        pravougaonik.displayInfo();
    }
}
