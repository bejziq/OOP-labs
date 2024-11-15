package org.example.week6.Lectures.Generics;

class Program {
    public static void main(String[] args) {
        int[] values = {1,2,3,4};

        for (int value : values) {
            System.out.println(value + " ");
        }

        StaticHandling.resetArray(values);


        for (int value : values) {
            System.out.println(value);
        }

    }
}

class StaticHandling {
    public static void resetArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
    }
}


