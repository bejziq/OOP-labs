package org.example.week6.Labs.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static boolean search(int[] array, int searchedValue) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int middle = left + (right - left) / 2;

            if (array[middle] == searchedValue) {
                return true;
            } else if (array[middle] < searchedValue) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] array = {-3, 2, 3, 4, 7, 8, 12};
        Scanner reader = new Scanner(System.in);

        System.out.println("Values of the array: " + Arrays.toString(array));
        System.out.println();
        System.out.print("Enter searched number: ");

        String searchedValue = reader.nextLine();
        System.out.println();

        boolean result = BinarySearch.search(array, Integer.parseInt(searchedValue));

        if (result) {
            System.out.println("The value " + searchedValue + " was found in the array.");
        } else {
            System.out.println("The value " + searchedValue + " was not found in the array.");
        }

        reader.close();
    }
}
