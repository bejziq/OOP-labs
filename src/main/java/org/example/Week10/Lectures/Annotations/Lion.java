package org.example.Week10.Lectures.Annotations;

import org.example.Week10.Labs.Examples.ImportantString;
import org.example.Week10.Labs.Examples.RunImmediately;
import org.example.Week10.Labs.Examples.VeryImportant;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@VeryImportant
record Lion(String name) {

    @RunImmediately
    public void saySomething() {
        System.out.println("lion method saySomething");
    }

    public void saySomethingButDontRun() {
        System.out.println("lion method saySomethingButDontRun");
    }

    @RunImmediatelyNTimes(times = 3)
    public void saySomethingNTimes() {
        System.out.println("multiple times");
    }

}

class Fox {
    @ImportantString // for fields
    public String name;
    public int numOfLegs;

    public Fox(String name, int numOfLegs) {
        this.name = name;
        this.numOfLegs = numOfLegs;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }


}

class MainAnnotation {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Lion lion = new Lion("lavcina");

        System.out.println(lion.getClass().isAnnotationPresent(VeryImportant.class)); // true

        for (Method method : lion.getClass().getDeclaredMethods()) {
            if (method.isAnnotationPresent(RunImmediately.class)) {
                System.out.println("Method name is: " + method.getName());
                method.invoke(lion);
            }
            else if(method.isAnnotationPresent(RunImmediatelyNTimes.class)) {
                RunImmediatelyNTimes annotation = method.getAnnotation(RunImmediatelyNTimes.class);

                for (int i = 0; i < annotation.times(); i++) {
                    method.invoke(lion);
                }
            }
        }


        Fox fox = new Fox("lija", 4);

        for (Field field : fox.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(ImportantString.class)) {
                field.setAccessible(true);
                Object value = field.get(fox);

                if (value instanceof String myFoxName) // String myFoxName = (String) value
                    System.out.println("The field name is " + field.getName() + "and its value in uppercase is " + myFoxName.toUpperCase());
            }
        }

    }
}