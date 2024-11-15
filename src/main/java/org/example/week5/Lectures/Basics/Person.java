package org.example.week5.Lectures.Basics;

import org.example.week3.db.DbConnect;

import java.lang.reflect.Array;
import java.rmi.MarshalledObject;
import java.util.ArrayList;
import java.util.Objects;

class Person {
    private String name;
    private int age;
    private int weight;
    private int height;
    private MyDate dateOfBirth;

    public Person(String name, int day, int month, int year) {
        this.name = name;
        this.age = 0;
        this.weight = 0;
        this.height = 0;
        this.dateOfBirth = new MyDate(11,5,2020); // custom atribut
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 0;
        this.height = 0;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void becomeOlder() {
        this.age++;
    }

    public void becomeOlder(int years) {
        this.age = this.age + years;
    }

    // metoda koja kao parametar prima objekat
    public boolean olderThan(Person comparedPerson) {
        if(this.age > comparedPerson.getAge()) {
            return true;
        }
        return false;
        // return this.age > comparedPerson.age;
    }

    public String toString() {
        return this.name + ", age: " + this.age;
    }
}

class Main {
    public static void main(String[] args) {
        // CONSTRUCTOR OVERLOADING
        Person becir = new Person("becir", 30);
        Person imran = new Person("imran", 20);
        System.out.println(becir.getName());
        System.out.println(imran.getAge());

        // METHOD OVERLOADING
        // imran.becomeOlder();
        System.out.println(imran.getAge()); // 21

        becir.becomeOlder(2);
        System.out.println(becir.getAge()); // ispisuje 2 jer je inicijalizirano u konstuktoru age na 0

        Person almin = new Person("Almin", 21);

        if (imran.getAge() > almin.getAge()) {
            System.out.println(imran.getName() + " is older than " + almin.getName());
        }
        else {
            System.out.println(imran.getName() + " is not older than " + almin.getName());
        }

        System.out.println(imran.olderThan(almin));
        System.out.println(almin.olderThan(imran));

        MyDate date = new MyDate(11,5,2004);
        System.out.println(date); // ispisuje toString metodu iako je nisam pozvao


        Book knjiga = new Book("Mesa Selimovic", "Tvrdjava");
        Book nekaKnjiga = new Book("Ivo Andic", "na drini cuprija");
        Book knjiga2 = new Book("Mesa Selimovic", "Tvrdjava");

        System.out.println(knjiga.equals(knjiga2)); // true, isit parametri

    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
        return this.day + " " + this.month + " " + this.year;
    }

    public boolean eralier(MyDate compared) {
        if (this.year < compared.getYear()) {
            return true;
        }

        if (this.year == compared.getYear() && this.month < compared.getMonth()) {
            return true;
        }

        if (this.year == compared.getYear() && this.month == compared.getMonth() && this.day < compared.getDay()) {
            return true;
        }
        return false;
    }
}

class ListOperations {
    public static void main(String[] args) {
        ArrayList<Person> personArrayList= new ArrayList<Person>();
        personArrayList.add(new Person("ali", 20));
        personArrayList.add(new Person("ajdin", 20));
        for (Person person : personArrayList) {
            System.out.println(person);
        }
    }

}


class Book {
    private String author;
    private String title;

    public Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }

        if (obj instanceof Book) {
            Book otherBook = (Book)obj; // (Book) type casting, converting the general Object type to a more specific types
            return this.author.equals(otherBook.getAuthor()) && this.title.equals(otherBook.getTitle());
        }
        return false;
    }

}