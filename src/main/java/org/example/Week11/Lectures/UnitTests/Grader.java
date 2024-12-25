package org.example.Week11.Lectures.UnitTests;

public class Grader {
    public char determineLetterGrade(int numberGrade) {
        if (numberGrade < 0 || numberGrade > 100) {
            throw new IllegalArgumentException("Number grade has to be positive and less than or equal to 100");
        }
        else if(numberGrade < 60) {
            return 'F';
        }
        else if(numberGrade < 70) {
            return 'D';
        }
        else if (numberGrade < 80) {
            return 'C';
        }
        else if (numberGrade < 90) {
            return 'B';
        }
        else {
            return 'A';
        }
    }
}
