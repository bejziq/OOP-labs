package org.example.week2;
import java.util.Scanner;
// Create a program that reads numbers from the user and prints their sum. The program should stop asking for numbers when the user enters the number 0.
public class Task3 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int suma = 0;
        while (true){
            System.out.println("enter numbers, if you want to stop enter 0");
            int number = Integer.parseInt(reader.nextLine());
            if (number == 0){
                break;
            }
            else{
                suma += number;
            }
        }
        System.out.println("suma brojeva je: " + suma);
    }
}
