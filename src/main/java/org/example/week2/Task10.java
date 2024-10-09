package org.example.week2;
import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int correctAnswer = 66;
        while (true){
            System.out.println("enter the number in range 1 - 100");
            int playerGuess = Integer.parseInt(reader.nextLine());

            if (playerGuess < 1 || playerGuess > 100){
                System.out.println("invalid guess");
                continue;
            }

            if (playerGuess == correctAnswer){
                System.out.println("you are correct");
                break;
            }
            else if(playerGuess < correctAnswer){
                System.out.println("Higher!");
            }
            else if(playerGuess > correctAnswer){
                System.out.println("Lower!");
            }
            else{
                System.out.println("invalid input, try again! ");
            }
        }
    }
}
