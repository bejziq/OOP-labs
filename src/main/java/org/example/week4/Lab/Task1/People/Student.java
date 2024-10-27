package org.example.week4.Lab.Task1.People;

public class Student extends Person{
    private int credits;
    private int student_id;
    private int grades;


    public Student(String name, String address, int age, String country, int student_id, int grades) {
        super(name, address, age, country);
        this.credits = 0;
        this.student_id = student_id;
        this.grades = grades;
    }

    public int credits() {
        return credits;
    }

    public void study() {
        this.credits++;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

}
