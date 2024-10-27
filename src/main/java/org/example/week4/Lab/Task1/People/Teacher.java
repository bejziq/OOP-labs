package org.example.week4.Lab.Task1.People;

import java.awt.font.TextHitInfo;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int age, String country, int salary) {
        super(name, address, age, country);
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n " + "Salary " +  this.salary + " euros/month";
    }
}
