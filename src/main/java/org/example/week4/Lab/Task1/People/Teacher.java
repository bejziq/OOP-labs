package org.example.week4.Lab.Task1.People;

public class Teacher extends Person{
    private int salary;

    public Teacher(String name, String address, int age, String country, int salary) {
        super(name);
        this.salary = salary;
    }

    public Teacher(String eskoUkkonen, String address) {
        super(address);
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\n " + "Salary " +  this.salary + " euros/month";
    }
}
