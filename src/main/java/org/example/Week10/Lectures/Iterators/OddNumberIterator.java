package org.example.Week10.Lectures.Iterators;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class OddNumberIterator implements Iterator<Integer>{
    private int[] elements;
    private int currentIndex = 0;

    public OddNumberIterator(int[] elements) {
        this.elements = elements;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9};

        OddNumberIterator iterator = new OddNumberIterator(numbers);

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Override
    public boolean hasNext() {
        while(currentIndex < elements.length && elements[currentIndex] % 2 == 0) {
            currentIndex++; // skip even numbers
        }
        return currentIndex < elements.length; // true or false based on this condition
    }

    @Override
    public Integer next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        } else {
            return elements[currentIndex++];
        }
    }
}
