package org.example.week6.Labs.Tasks;

public class Task3 {
    public static int indexOfTheSmallestStartingFrom(int[] arr, int index){
        int smallest = arr[index];
        int indexOfElement = index;

        for (int i = index; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
                indexOfElement = i;
            }
        }
        return indexOfElement;
    }


    public static void main(String[] args) {
        int[] values = {-1, 6, 9, 8, 12};
        System.out.println(indexOfTheSmallestStartingFrom(values, 1));
        System.out.println(indexOfTheSmallestStartingFrom(values, 2));
        System.out.println(indexOfTheSmallestStartingFrom(values, 4));
    }
}
