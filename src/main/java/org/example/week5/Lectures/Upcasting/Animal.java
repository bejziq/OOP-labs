package org.example.week5.Lectures.Upcasting;

class Animal {
    public void eat() {
        System.out.println("animal is eating");
    }
}


class Turtle extends Animal {
    @Override
    public void eat() {
        System.out.println("turtle is eating");
    }
}

class Tiger extends Animal {
    @Override
    public void eat() {
        System.out.println("tiger is eating");
    }
}


class Main {
    public static void main(String[] args) {
        Animal animal = new Tiger();
        Animal turtle = new Turtle();

        doSomeAnimalStuff(animal); // tiger is eating
        doSomeAnimalStuff(turtle); // turtle is eating
    }


    public static void doSomeAnimalStuff(Animal animal) {
        animal.eat();
    }

}