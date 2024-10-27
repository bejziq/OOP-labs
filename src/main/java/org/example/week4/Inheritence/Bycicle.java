package org.example.week4.Inheritence;

import javax.swing.plaf.PanelUI;

enum BicycleType{
    BMX, MTB
}
public class Bycicle extends Vehicle{
    private BicycleType type;

    public Bycicle(double speed, int numberOfWheels, BicycleType type) {
        super(speed, numberOfWheels);
        this.type = type;
    }

    @Override
    public void produceNoise() {
        System.out.println("I am producing bicycle noise");
    }

    public BicycleType getType() {
        return type;
    }

    public void setType(BicycleType type) {
        this.type = type;
    }
}
