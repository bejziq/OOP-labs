package org.example.week2;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        while (true){
            System.out.println("enter password");
            String password = reader.nextLine();
            String correctPassword = "imran";
            //.equals(varijabla) -> provjerava da li su dva objekta logicki jendaka
            if (password .equals(correctPassword)){
                System.out.println("correct");
                break;
            }
            else{
                System.out.println("wrong");
            }
        }
        }
}
