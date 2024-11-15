package org.example.week5.Labs;

import org.example.week5.Lectures.Interface.Readable;

abstract class Vehicle {

    private String modelName;
    private int mileage;
    private int health;

    public Vehicle(String modelName) {
        this.modelName = modelName;
        this.mileage = 0;
        this.health = 100;
    }

    public Vehicle(String modelName, int mileage, int health) {
        this.modelName = modelName;
        this.mileage = mileage;
        this.health = health;
    }

    public String getModelName() {
        return this.modelName;
    }

    public int getMileage() {
        return this.mileage;
    }

    public int getHealth() {
        return this.health;
    }

    abstract String service();

    public boolean needsMaintenance() {
        if (this.health < 70) {
            return true;
        }
        else {
            return false;
        }
    }
}

interface Repairable {
    String repair();
}


class Car extends Vehicle implements Repairable {

    public Car(String modelName) {
        super(modelName);
    }

    public Car(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    public String repair() {
        return "ovo je metoda iz Repairable interfejsa, koja se nalazi u Car klasi";
    }

    @Override
    public String service() {
        return "ovo je metoda iz Vehicle koja je apstraktna";
    }

    public void drive(int miles) {
        int newMiles = getMileage() + miles;
        System.out.println(newMiles);
    }

}

class Truck extends Vehicle implements Repairable{

    public Truck(String modelName) {
        super(modelName);
    }

    public Truck(String modelName, int mileage, int health) {
        super(modelName, mileage, health);
    }

    @Override
    public String service() {
        return "ovo je metoda iz Vehicle";
    }

    @Override
    public String repair() {
        return "ovo je metoda iz Interface koju nisam implementovo u ovu klasu";
    }
}

class Main {
    public static void main(String[] args) {
        Vehicle auto = new Car("mercededs", 1410131, 33);
        System.out.println(auto.getHealth());
        System.out.println(auto.service());

        // Vehicle vozilo = new Vehicle("bmw", 213113, 21): vehicle is abstract, and it cannot be instantiated
        Car car = new Car("bmw", 3333, 1);
        System.out.println(car.repair());
    }
}