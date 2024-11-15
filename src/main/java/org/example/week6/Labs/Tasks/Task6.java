package org.example.week6.Labs.Tasks;

public class Task6 {
    public static void printElegantly(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }

    public static void main(String[] args) {
        int[] array = {5, 1, 3, 4, 2};
        printElegantly(array);
    }
}
