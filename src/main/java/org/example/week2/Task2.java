package org.example.week2;
// Create a program that asks the user for three numbers and then prints their sum.
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < 3; i++){
            System.out.println("enter number");
            int number = Integer.parseInt(reader.nextLine());
            suma += number;
        }

        System.out.println("sum of three numbers is: " + suma);
    }
}

