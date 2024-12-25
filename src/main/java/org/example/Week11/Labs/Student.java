package org.example.Week11.Labs;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

class PasswordLengthException extends RuntimeException {
    public PasswordLengthException(String message) {
        super(message);
    }
}

public class Student {
    private String username;
    private String password;
    private int ID;
    private String email;

    public Student(String username, String password, int ID, String email) {

        if (password.length() < 5) {
            throw new PasswordLengthException("ne valja ti ovaj password");
        }

        this.username = username;
        this.password = password;
        this.ID = ID;
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public int getID() {
        return ID;
    }

    public String getEmail() {
        return email;
    }

    public void writeToFile() throws IOException {
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("/Users/Bejziq/Desktop/imran.txt")
        );

        writer.write(username);
        writer.newLine();
        writer.write(password);

        writer.close();
    }


    public static void main(String[] args) throws IOException{
        Student student = new Student("imran", "imrbas", 2131, "imran@gmail.com");
        student.writeToFile();
        System.out.println("Student details writed to file successfuly");
    }
}
