package org.example.week6.Labs.Tasks;

public class Task1 {
    public static int smallest(int [] array) {
        int smallest = array[0];

        for (int i : array) {
            if (i < smallest) {
                smallest = i;
            }
        }
        return smallest;
    }

    public static void main(String[] args) {
        int[] values = {6, 5, 8, 6, 11};
        System.out.println("smallest: " + smallest(values));
    }
}
