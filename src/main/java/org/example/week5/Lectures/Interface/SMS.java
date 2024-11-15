package org.example.week5.Lectures.Interface;

public class SMS implements Readable{
    private String sender;
    private String content;

    public SMS (String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    @Override
    public String read() {
        return this.content; // abstraktna metoda iz intefejsa
    }

    @Override
    public String toString() {
        return "sender: " + sender + " content: " + content;
    }
}
