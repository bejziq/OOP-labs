package org.example.week6.Lectures.Generics;

public class Student implements Comparable<Student>{
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return this.gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public int compareTo(Student o) {
        if (this.gpa == o.getGpa()) {
            return 0;
        }
        else if(this.gpa > o.getGpa()) {
            return 1;
        }
        else {
            return -1;
        }
    }

    interface Attendable <T extends Student> {
        void beSilent();
        void followLecture();
    }

    // Bounded generics
    class Animal {
        private String name;

        public Animal(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void eat() {
            System.out.println("Animal is eating");
        }
    }
    class Elephant extends Animal{
        public Elephant(String name) {
            super(name);
        }

        public void eat() {
            System.out.println("Elephant is eating");
        }
    }
    class Mouse extends Animal{
        public Mouse(String name) {
            super(name);
        }

        public void eat() {
            System.out.println("Mouse is eating");
        }
    }

    class BoundedPrinter<T extends Animal> {
        private T thing;

        public BoundedPrinter(T thing) {
            this.thing = thing;
        }
        // bounded generic
        public void printAnimalEatingHabits() {
            this.thing.eat();
        }
    }


}
