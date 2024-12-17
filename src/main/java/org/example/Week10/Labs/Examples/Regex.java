package org.example.Week10.Labs.Examples;

import java.util.Scanner;

public class Regex {
    public static void main(String[] args) {
        System.out.println("Enter your email address");
        Scanner email = new Scanner(System.in);

        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";

        if (email.equals(emailRegex)) {
            System.out.println("The email address is valid");
        } else {
            System.out.println("The email address is not valid");
        }
    }
}
