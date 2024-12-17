package org.example.Week10.Labs.Examples;


import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant
class Cat {

    @ImportantString
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void saySomething() {
        System.out.println("mackica kaze nesta");
    }


    // if we want to run this method n number of times we sould specify parameters in a annotation
    @RunImmediately(times = 3)
    public void meow() {
        System.out.println("meow!");
    }

}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) { 
        this.name = name;
    }

    public static void saySomething() {
        System.out.println("aw aw");
    }
}

class MainAnnotationClass {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Cat cat = new Cat("cicka");

        // if we want to check if a class is annoted with a custom annotation we would do it like this:

        if (cat.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("class cat is very important");
        }
        else {
            System.out.println("class cat is not very important");
        }

        Dog cuko = new Dog("rex");
        if (cuko.getClass().isAnnotationPresent(VeryImportant.class)) {
            System.out.println("class dog is very important");
        }
        else {
            System.out.println("class dog is not very important");
        }

        // if we wnat to chech if a method in an annoted class is annoted with a custom annotation we would do it like this:

        for (Method method : cat.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                RunImmediately annotation = method.getAnnotation(RunImmediately.class);

                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(cat);
                }
                System.out.println("Method name is: " + method.getName());
                method.invoke(cat); // OUTPUT IZ METODE MEOW
            }
        }

        // this is used to get the fields of a cat class, fields are anoted with a @ImportantString
        for (Field field : cat.getClass().getFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                Object objectVal = field.get(cat);

                if (objectVal instanceof String stringVal) {
                    System.out.println(stringVal.toUpperCase());
                }
            }
        }
    }
}