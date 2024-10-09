package org.example.week1;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("enter a number: ");
        int number = Integer.parseInt(reader.nextLine());
        if (number > 0){
            System.out.println("number " + number + " is greater than zero");
        }
        else{
            System.out.println("number " + number + " is less than zero");
        }

    }
}
