package org.example.Week10.Labs.Examples;

import java.io.*;

public class FileManipulation {


    public static void main(String[] args) throws IOException {
        fileWriter();
        fileReader();
    }

    public static void fileWriter() throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/Bejziq/Desktop/fajl.txt")
        );

        String[] names = {"Imran", "Almmin", "ahmed"};

        for (String name : names) {
            writer.write(name + "\n");
        }

        writer.close();
    }


    public static void fileReader() throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("fajl.txt")
        );

        String line = "";
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }

        reader.close();
    }

}
