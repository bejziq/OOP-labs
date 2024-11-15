package org.example.week4.Lab.Task1.People;

public class Person {
    private String name;
    private String address;
    private int age;
    private String country;

    public Person(String name) {
        this.name = name;
        this.address = address;
    }

    public Person(int age, String country) {
        this.age = age;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return this.name + " \n " + " " + this.address;
    }
}
