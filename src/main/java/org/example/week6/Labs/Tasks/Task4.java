package org.example.week6.Labs.Tasks;
import java.util.*;

public class Task4 {
    public static void swap(int[] array, int index1, int index2){
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        int[] values = {3, 2, 5, 4, 8};

        System.out.println("Before Swap: " + Arrays.toString(values));
        Task4.swap(values, 1, 0);
        System.out.println("After 1. Swap: " + Arrays.toString(values));
        Task4.swap(values, 0, 3);
        System.out.println("After 2. Swap: " + Arrays.toString(values));
    }

}
