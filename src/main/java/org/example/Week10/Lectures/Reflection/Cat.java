package org.example.Week10.Lectures.Reflection;

import java.lang.reflect.Field;

public class Cat {
    private final String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static void thisIsPublicStaticMethod() {
        System.out.println("I'm public and static");
    }
    public void meow() {
        System.out.println("meow");
    }
    public void saySomething(String something) {
        System.out.println("I said something ".concat(something));
    }
    private void heyThisIsPrivate() {
        System.out.println("How did you call this?");
    }

    // Let's use some reflection now to get all fields inside of the Cat class

}


class ReflectionMain {
    public static void main(String[] args) throws IllegalAccessException {
        Cat macka = new Cat("Cicko", 12);
        macka.getClass(); // Window to number of reflection capabilities of Java
        Field[] catField = macka.getClass().getDeclaredFields(); // get all attributes of the Cat class

        for (Field f : catField) {
            System.out.println(f.getName()); // returna atribute name i age
        }

        System.out.println("------------------");

        for (Field field : catField) {
            if (field.getName().equals("name")) {
                field.setAccessible(true);
                field.set(macka, "micko cicko");
            }
        }

        System.out.println(macka.getName()); // micko cicko nakon promjene
        System.out.println(macka.getAge());
    }
}