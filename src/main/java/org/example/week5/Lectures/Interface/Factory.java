package org.example.week5.Lectures.Interface;

import java.util.Random;


public class Factory {

    public static void main(String[] args) {
        Factory factory = new Factory();
        
    }

    public Item produceNew() {
        Random random = new Random();
        int num = random.nextInt(4);
        if(num == 0) {
            return new CD("Pink floyf", 1992);
        }
        else if(num == 1) {
            return new CD("Wigwam", 1974);
        }
        else if(num == 2) {
            return new Book("Robert Marin", 2001);
        }
        else {
            return new Book ("Kent Beck", 1821);
        }
    }
}
