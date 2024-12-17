package org.example.Week10.Labs.Examples;

import java.lang.reflect.Field;

public class Car {
    private String model;
    private int year;

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    public void drive() {
        System.out.println("Driving " + model + " of year " + year);
    }


    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Car autic = new Car("GLC", 2020);

        Field modelField = autic.getClass().getDeclaredField("model");
        modelField.setAccessible(true);
        modelField.set(autic, "Honda");

        System.out.println(autic.model);
    }
}
