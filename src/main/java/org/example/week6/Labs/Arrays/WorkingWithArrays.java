package org.example.week6.Labs.Arrays;

import java.util.Arrays;

class WorkingWithArrays {
    int[] numbers = {100, 1, 42};
    String[] cars = {"Bmw", "Audi", "Mercedes"};
    double[] floatingNumberArray = {1.2, 10.3, 30.1};

    // numbers[0] = 1; ovo ne moze jer je izvan metode
    // moramo definisati metodu za mijenjanje arraya
    public void modifyArray() {
        numbers[0] = 1;
    }

    // moze i ovo
    {
        numbers[0] = 2;
    }

    public void printElementFromArray() {
        System.out.println(Arrays.toString(numbers));
    }


    public void loopingThroughArray() {
        int index = 0;
        while (index < numbers.length) {
            System.out.println(Arrays.toString(numbers)); // Arrays.toString - built in metoda iz Arrays java.util.Arrays
            index++;
        }
    }


    // for each loop with arrays

    int [] values = {2,4,5,6};
    public void ForEachLooping() {
        for (int value : values) {
            System.out.println(value);
        }
    }


    String [] fruits = {"Banana", "Apple", "Orange"};
    public void StringLooping() {
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public static void main(String[] args) {
        WorkingWithArrays brojevi = new WorkingWithArrays();
        //brojevi.loopingThroughArray();

        brojevi.printElementFromArray(); // printa citav array
        brojevi.ForEachLooping();

        brojevi.StringLooping();
    }
}

