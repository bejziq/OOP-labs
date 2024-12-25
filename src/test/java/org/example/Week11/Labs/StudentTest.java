package org.example.Week11.Labs;

import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class StudentTest {
    @Test
    void fileMethod() throws IOException {
        Student student = new Student("imran", "imrbas", 123, "imran@gmail.com");

        BufferedReader reader = new BufferedReader(
                new FileReader("/Users/Bejziq/Desktop/imran.txt")
        );

        String line1 = reader.readLine();
        String line2 = reader.readLine();
        String line3 = reader.readLine();

        assertEquals(line1, student.getUsername());
        assertEquals(line2, student.getPassword());
        assertNull(line3, "line 3 should be null");
    }
}