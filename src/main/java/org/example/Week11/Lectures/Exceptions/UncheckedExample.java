package org.example.Week11.Lectures.Exceptions;

class UncheckedExample {
    public static void main(String[] args) {
        String nekiString = null;

        try {
            System.out.println(nekiString.length());
        } catch (NullPointerException e) {
            System.out.println("caught unchecked " + e.getMessage());
        }
    }
}

class ArrayExample {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[5]);
        } catch (IndexOutOfBoundsException iobe) {
            System.out.println("caught unchecked: " + iobe.getMessage());
        }
    }
}