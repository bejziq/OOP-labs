package org.example.week2;
import java.util.Scanner;
public class Task6 {
    static void printText(){
        Scanner reader = new Scanner(System.in);
        System.out.println("enter how much times do you want to display the text: ");
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 1; i <= n; i++){
            System.out.println(i + "->" + " the beginning there were the swamp, the hoe and Java.");
        }
    }

    public static void main(String[] args){
        printText();
    }
}
