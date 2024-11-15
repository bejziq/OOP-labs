package org.example.week6.Labs.Generics;

public class SomeGeneric <T>{
    public static <T,E> E printAndReturnGeneric(T firstGeneric, E secondGeneric) {
        System.out.println(firstGeneric);
        return secondGeneric;
    }
}

class Pokreni {
    public static void main(String[] args) {
        SomeGeneric pokreniGeneric = new SomeGeneric();
        SomeGeneric.printAndReturnGeneric("rijec", 21);
        System.out.println(SomeGeneric.printAndReturnGeneric("ovo printa i prvi i drugi generic", 21));
    }
}