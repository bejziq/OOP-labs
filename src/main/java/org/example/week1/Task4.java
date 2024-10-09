package org.example.week1;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter number 1: ");
        int number1 = Integer.parseInt(reader.nextLine());
        System.out.println("enter number 2: ");
        int number2 = Integer.parseInt(reader.nextLine());
        System.out.println("sum of two integers is: " + (number1 + number2));
    }
}
