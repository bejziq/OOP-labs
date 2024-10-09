package org.example.week1;
import java.util.Scanner;
public class Task6 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter first number: ");
        int firstNumber = Integer.parseInt(reader.nextLine());
        System.out.println("enter second number: ");
        int secondNumber = Integer.parseInt(reader.nextLine());
        if (firstNumber == secondNumber){
            System.out.println("both are the same");
        }
        else if (firstNumber > secondNumber){
            System.out.println("first number is greater than second number");
        }
        else {
            System.out.println("second number is greater than first number");
        }
    }
}
