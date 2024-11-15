package org.example.week5.Lectures.Polymorphism.readable;

public class SMS implements Readable{
    private String sender;
    private String content;

    public SMS(String sender, String content) {
        this.sender = sender;
        this.content = content;
    }

    public String getSender() {
        return this.sender;
    }

    public String getContent() {
        return this.content;
    }

    @Override
    public String read() {
        return this.content;
    }
}
