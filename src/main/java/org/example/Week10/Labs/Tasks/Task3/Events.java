package org.example.Week10.Labs.Tasks.Task3;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Events {

    private static final String[] EVENT_TYPES = new String[] {"Login", "Logout", "Purchase", "ViewPage", "Error"};
    private static final int RECORD_NUMBER = 1000000;


    public static void main(String[] args) throws IOException {
        Events e = new Events();
        e.generateEventsFile("/Users/Bejziq/Desktop/events.txt", 9);
        Events.printEventsFromFile("events.txt");
        ArrayList<String> array = Events.readEventsFromFile("events.txt");
        System.out.println(array);

    }

    public static void generateEventsFile(String fileName, int numberOfRecords) throws IOException {

        BufferedWriter writer = new BufferedWriter(
                new FileWriter(fileName)
        );

        Random random = new Random();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        for (int i = 0; i < numberOfRecords; i++) {
            String timeStamp = dateFormat.format(new Date(System.currentTimeMillis() - random.nextInt(1000000000)));
            String eventType = EVENT_TYPES[random.nextInt(EVENT_TYPES.length)];
            int userId = random.nextInt(100);

            writer.write(timeStamp + "| Event type: " + eventType  + " | UserID: " + userId);
            writer.newLine();
        }
        writer.close();
    }


    public static void printEventsFromFile (String filename) throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader(filename)
        );

        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        System.out.println();
    }


    public static ArrayList<String> readEventsFromFile(String fileName) throws IOException {
        ArrayList<String> records = new ArrayList<>();

        BufferedReader reader = new BufferedReader(
                new FileReader(fileName)
        );

        String line;
        while ((line = reader.readLine()) != null) {
            records.add(line);
        }
        return records;
    }

}
