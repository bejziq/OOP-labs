package org.example.week5.Lectures.Practice;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + " " + this.age;
    }

    public void becomeOleder() {
        this.age++;
    }

    public int getAge() {
        return this.age;
    }

    public String getName() {
        return this.name;
    }


    public static void main(String[] args) {
        Person person = new Person("Imran", 20);
        System.out.println(person); // imran 20

        Person peka = person;
        peka.becomeOleder();
        System.out.println(person); // imran 21

        person = new Person("Almin", 22);
        System.out.println(person); // almin 22
        System.out.println(peka); // imran 21

        Person imran = new Person("imran", 20);
        Person becir = new Person("becir", 30);

        if (imran.getAge() > becir.getAge()) {
            System.out.println(becir.getName() + " is younger than " + imran.getName());
        }
        else {
            System.out.println(becir.getName() + " is older than " + imran.getName());
        }

    }

}
