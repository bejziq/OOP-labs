package org.example.week6.Labs.Generics;

public class Animal {
    private int numOfLegs;

    public int getNumOfLegs() {
        return this.numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public void eat() {
        System.out.println("animal is eating");
    }
}


class SpecifiedPrinter <T extends Animal> {
    private T thingToPrint;

    public SpecifiedPrinter(T thingToPrint) {
        thingToPrint.eat();
        this.thingToPrint = thingToPrint;
    }

    public T getThingToPrint() {
        return this.thingToPrint;
    }

    public void setThingToPrint(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void print() {
        System.out.println(this.thingToPrint);
    }
}

class Start {
    public static void main(String[] args) {
        // Kreiramo instancu klase Animal
        Animal animal = new Animal();
        animal.setNumOfLegs(4);

        // Kreiramo SpecifiedPrinter za objekat tipa Animal
        SpecifiedPrinter<Animal> animalPrinter = new SpecifiedPrinter<>(animal);

        // Pozivamo metodu print
        animalPrinter.print();

        // Ispis broja nogu koristeći getter
        System.out.println("Animal has " + animal.getNumOfLegs() + " legs.");
    }
}
