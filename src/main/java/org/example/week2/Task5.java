package org.example.week2;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        System.out.println("enter the nth number to calculate the number to that power: ");
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());

        int result = (int)  Math.pow(n, 2);
        System.out.println(result);

    }
}




