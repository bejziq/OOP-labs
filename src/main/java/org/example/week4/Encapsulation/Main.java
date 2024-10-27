package org.example.week4.Encapsulation;

public class Main {
    public static void main(String[] args) {
        AccountBallance imran = new AccountBallance();
        imran.setBallance(-2);
        System.out.println(imran.getBallance());
        AccountBallance almin = new AccountBallance(); // nema konstruktora
        almin.setBallance(-231);
    }
}
