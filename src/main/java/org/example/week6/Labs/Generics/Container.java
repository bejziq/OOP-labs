package org.example.week6.Labs.Generics;

// ova klasa ce biti tipa generic

import org.example.week6.Labs.Tasks.Generic;

public class Container <T>{
    private T name;
    private T age;

    public Container(T name, T age) {
        this.name = name;
        this.age = age;
    }

    public T getName() {
        return this.name;
    }

    public T getAge() {
        return this.age;
    }

    public static <T> void generickaMetda(T printajOvo) {
        System.out.println("ovo je genericka metoda i ona printa: " + printajOvo);
    }

}

class Main {
    public static void main(String[] args) {
        Container container = new Container("kutija", 21);
        System.out.println(container.getAge());

        Container.generickaMetda(" neki string tekst");
        Container.generickaMetda(2);
        Container.generickaMetda(3.311); // genericke metode su fleksibilne, mozmeo ubaciti kao aprametar bilo koji tip podataka

    }
}