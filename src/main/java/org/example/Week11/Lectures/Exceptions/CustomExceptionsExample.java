package org.example.Week11.Lectures.Exceptions;

public class CustomExceptionsExample {
    public static void main(String[] args) throws AgeLessThanZeroException{
        valiteAge(4); // no exception
        valiteAge(-1); // dobijemo exception
    }

    private static void valiteAge(int age) throws AgeLessThanZeroException{
        if (age < 0) {
             // throw : sada ide nas custom exception
            throw new AgeLessThanZeroException("message", new RuntimeException());
        }
    }


}
