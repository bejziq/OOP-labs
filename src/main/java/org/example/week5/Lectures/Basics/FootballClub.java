package org.example.week5.Lectures.Basics;

import java.util.ArrayList;

public class FootballClub {
    private String name;
    private int yearOfFoundation;
    private ArrayList<Person> players;

    public FootballClub(String name, int yearOfFoundation) {
        this.name = name;
        this.yearOfFoundation = yearOfFoundation;
        this.players = new ArrayList<Person>();
    }

    public static void main(String[] args) {
        FootballClub bosna = new FootballClub("Bosna Visoko", 1999);
        Person imran = new Person("Imran",20);
        Person almin = new Person("Almin", 17);
        Person ahmed = new Person("Ahmed", 21);
        Person ali = new Person("Ali", 24);
        Person ajdin = new Person("Ajdin", 22);
        Person mesa = new Person("mesa", 29);

        System.out.println(imran.getName());
        System.out.println(bosna.isAcceptedAsPlayer(imran));
        bosna.addPlayer(imran);
        System.out.println(bosna.isAcceptedAsPlayer(almin));
        bosna.addPlayer(ahmed);
        bosna.addPlayer(ali);
        bosna.addPlayer(ajdin);
        bosna.addPlayer(mesa);
        System.out.println(bosna.oldestPerson());
       // System.out.println(bosna.toString());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

    public ArrayList<Person> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Person> players) {
        this.players = players;
    }

    public boolean isAcceptedAsPlayer(Person player) {
        return player.getAge() > 18;
    }

    public void addPlayer(Person player) {
        if (isAcceptedAsPlayer(player)) {
            this.players.add(player);
        }
    }


    public Person oldestPerson() {
        Person oldest = players.get(0);

        for (Person player : players) {
            if (player.getAge() > oldest.getAge()) {
                oldest = player;
            }
        }
        return oldest;
    }


    @Override
    public String toString() {
        String playersString = "";

        for (Person player : players) {
            playersString += player.toString() + "\n";
        }
        return playersString;
    }


}
