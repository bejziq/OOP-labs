package org.example.week4.Inheritence;

import javax.swing.*;

public class Vehicle {
    private double speed;
    private int numberOfWheels;

    public Vehicle (double speed, int numberOfWheels) {
        this.speed = speed;
        this.numberOfWheels = numberOfWheels;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this.numberOfWheels = numberOfWheels;
    }

    public void produceNoise() {
        System.out.println("I am producing vehicle noise");
    }
}
