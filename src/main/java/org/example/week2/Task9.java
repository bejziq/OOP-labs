package org.example.week2;
import java.util.Scanner;
public class Task9 {
    static void drawNumberPiramid(){
        Scanner reader = new Scanner(System.in);
        int n = Integer.parseInt(reader.nextLine());
        for (int i = 0; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        drawNumberPiramid();
    }
}
