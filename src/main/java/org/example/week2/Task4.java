package org.example.week2;
import java.util.Scanner;
// Create a program that asks the user for the first number and the last number and
// then prints all numbers between those two. Use a while loop.
// If the first number is greater than the last number, the program prints those numbers.
public class Task4 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("enter first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());

        System.out.println("enter second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());

        if (firstNumber > secondNumber){
            int temp = firstNumber - 1;
            while (temp > secondNumber){
                System.out.println(temp);
                temp--;
            }
        }
        else if (firstNumber < secondNumber){
            int temp = firstNumber + 1;
            while (temp < secondNumber){
                System.out.println(temp);
                temp++;
            }
        }

        else{
            System.out.println(firstNumber);
        }

    }
}
