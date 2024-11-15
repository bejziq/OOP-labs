package org.example.week6.Labs.Tasks;
// indexOfTheSmallest
public class Task2 {
    public static int indexOfSmallest(int[] arr) {
        int smallest = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest){
                smallest = arr[i];
                index = i;
            }
        }

        return index;
    }

    public static void main(String[] args) {

        int[] values = {6, 5, 8, 6, 11};
        System.out.println("Index of smallest: " + indexOfSmallest(values));

    }
}
