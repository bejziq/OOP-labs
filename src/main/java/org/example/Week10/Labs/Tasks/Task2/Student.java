package org.example.Week10.Labs.Tasks.Task2;

import java.util.List;

public class Student {
    private String name;
    private int ID;
    private List<Integer> grades;

    public Student(String name, int ID, List<Integer> grades) {
        this.name = name;
        this.ID = ID;
        this.grades = grades;
    }

    public void printInfo() {
        System.out.println("Name: " + this.name + " ID: " + this.ID);
        System.out.println("Grades: ");
        for (int i : grades) {
            System.out.println(i);
        }
    }
}

class GradeAnalyser {
    private List<Integer> grades;

    public GradeAnalyser(List<Integer> grades) {
        this.grades = grades;
    }

    public double calculateAverage() {
        return grades.stream().mapToInt(Integer::intValue).average().orElse(0.0);
    }

    public void printSummary() {
        System.out.println("Average Grade: " + calculateAverage());
    }
}