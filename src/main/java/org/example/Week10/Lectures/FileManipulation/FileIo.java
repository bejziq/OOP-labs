package org.example.Week10.Lectures.FileManipulation;

import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileIo {
    public static void simpleWrite() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(
                new FileWriter("/Users/Bejziq/Desktop/output.txt") // kao parametar u BufferedWriter saljemo new FileWriter koji odredjuje destinaciju na koju ce se napraviti fajl
        );
        bufferedWriter.write("nest nebitno \n"); // u file upise nesta nebitno
        bufferedWriter.write("Another line of text.\n");
        bufferedWriter.close();
    }

    public static void readFromFile() throws IOException {
        String line = "";
        BufferedReader reader = new BufferedReader(
                new FileReader("/Users/Bejziq/Desktop/output.txt")
        );

        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

    public static void main(String[] args) throws IOException {
        //simpleWrite();
        readFromFile();
    }
}
