package org.example.Week10.Labs.Tasks.Task4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class Song {
    private String title;
    private String artist;
    private String genre;


    public Song(String title, String artist, String genre) {
        this.title = title;
        this.artist = artist;
        this.genre = genre;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}


class GenreFilterIterator implements Iterator<Song> {
    private Song[] playlist;
    private String targetGenre;
    private int currentIndex;

    public GenreFilterIterator(Song[] playlist, String targetGenre) {
        this.playlist = playlist;
        this.targetGenre = targetGenre;
        this.currentIndex = 0;
    }

    @Override
    public boolean hasNext() {
        while(currentIndex+1 <= playlist.length){
            if(playlist[currentIndex].getGenre().equals(targetGenre)) return true;
            else this.currentIndex++;
        }
        return false;
    }

    @Override
    public Song next() {
        if(!this.hasNext()){
            throw new NoSuchElementException("There are no more songs in the list that in the " + this.targetGenre + " genre.");
        } else{
            return playlist[currentIndex++];
        }
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<Song> playlist = new ArrayList<>();
        playlist.add(new Song("Shape of You", "Ed Sheeran", "Pop"));
        playlist.add(new Song("Bohemian Rhapsody", "Queen", "Rock"));
        playlist.add(new Song("Blinding Lights", "The Weeknd", "Pop"));
        playlist.add(new Song("Smells Like Teen Spirit", "Nirvana", "Rock"));
        playlist.add(new Song("Someone Like You", "Adele", "Ballad"));

        String targetGenre = "Pop";

        GenreFilterIterator genreIterator = new GenreFilterIterator(playlist.toArray(new Song[0]), targetGenre);

        System.out.println("Songs in the genre '" + targetGenre + "':");
        while (genreIterator.hasNext()) {
            Song song = genreIterator.next();
            System.out.println("Title: " + song.getTitle() + ", Artist: " + song.getArtist() + ", Genre: " + song.getGenre());
        }
    }
}