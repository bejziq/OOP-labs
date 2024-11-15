package org.example.week6.Lectures.Generics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClubMember implements Comparable<ClubMember>{
    private String name;
    private int height;

    public ClubMember(String name, int height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return this.name;
    }

    public int getHeight() {
        return this.height;
    }

    @Override
    public String toString() {
        return this.getName() +  " (" + this.getHeight() + ")";
    }

    @Override
    public int compareTo(ClubMember clubMember) {
        if (this.height == clubMember.getHeight()) {
            return 0;
        }
        else if(this.height > clubMember.getHeight()) {
            return 1;
        }
        else {
            return -1;
        }
    }
}


class StartGeneric {
    public static void main(String[] args) {
        List<ClubMember> clubMembers = new ArrayList<>();
        clubMembers.add(new ClubMember("imran", 181));
        clubMembers.add(new ClubMember("almin", 190));
        clubMembers.add(new ClubMember("ali", 150));

        System.out.println(clubMembers);
        Collections.sort(clubMembers);
        System.out.println(clubMembers);
    }
}


class Animal {
    private int numOfLegs;

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void eat() {
        System.out.println("Animal Eating");
    }
}

class SpecificPrinter <T extends Animal> {
    private T thingToPrint;

    public SpecificPrinter(T thingToPrint) {
        //thingToPrint.eat();
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }

}
