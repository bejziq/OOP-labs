package org.example.week4.Inheritence.CarComponents;

enum GearboxType {
    AUTOMATIC, MANUAL
}

public class Gearbox extends Components{
    private int numberOfSpeeds;
    private GearboxType type;

    public Gearbox(String name, String barCode, int numberOfSpeeds, GearboxType type) {
        super(name, barCode);
        this.numberOfSpeeds = numberOfSpeeds;
        this.type = type;
    }

    public int getNumberOfSpeeds() {
        return numberOfSpeeds;
    }

    public void setNumberOfSpeeds(int numberOfSpeeds) {
        this.numberOfSpeeds = numberOfSpeeds;
    }

    public GearboxType getType() {
        return type;
    }

    public void setType(GearboxType type) {
        this.type = type;
    }

    @Override
    public void sayWhoIam() {
        System.out.println("I am gearbox");
    }

    @Override
    public String toString() {
        return this.numberOfSpeeds + " " + this.type;
    }
}
