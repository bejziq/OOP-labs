package org.example.Week10.Lectures.FileManipulation;

import java.io.*;
import java.util.stream.Collectors;
import java.util.List;

public class ArrayFileWriting {
    public static void main(String[] args) throws IOException {
        String[] names = {"Imran", "Almin"};
        //writeInArrayFile(names);
        //readArrayFile();
        secondWayToRead();

    }

    public static void writeInArrayFile(String[] data) throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/Bejziq/Desktop/deleteme.txt")
        );

        for (String row : data) {
            writer.write("\n" + row);
        }
        writer.close();
    }

    public static void readArrayFile() throws IOException{
        BufferedReader bufferedreader = new BufferedReader(
                new FileReader("deleteme.txt")
        );

        List<String> lines = bufferedreader.lines().collect(Collectors.toList());

        for (String line : lines) {
            System.out.println(line);
        }

        bufferedreader.close();
    }


    public static void secondWayToRead() throws IOException{
        BufferedReader reader = new BufferedReader(
                new FileReader ("output.txt") // ne radi za deleteme.txt jer je array
        );

        String tempLine;

        while((tempLine = reader.readLine()) != null) {
            System.out.println(tempLine);
        }

        reader.close();
    }
}
