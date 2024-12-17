package org.example.Week11.Lectures.Exceptions;
import java.io.FileReader;
import java.io.IOException;

public class FinallyExample {
    public static void main(String[] args) {
        FileReader reader = null;

        try {
            reader = new FileReader("nekiTekst.txt");
            System.out.println("file opened successfully");
            int data = reader.read();
            System.out.println("Data: " + data);
        } catch (IOException e) {
            System.out.println("An error occured: " + e.getMessage());
        }
        finally {
            try {
                if (reader != null) {
                    reader.close();
                    System.out.println("file closed.");
                }
            } catch (IOException e) {
                System.out.println("error occured while closing the file: " + e.getMessage());
            }
        }
    }
}
