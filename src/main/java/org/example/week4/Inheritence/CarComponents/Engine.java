package org.example.week4.Inheritence.CarComponents;

enum EngineType {
    COMBUSTION_ENGINE, HYBRID, ELECTRIC
}

public class Engine extends Components{
    private int horsePower;
    private int torque;
    private EngineType type;


    public Engine(String name, String barCode, int horsePower, int torque, EngineType type) {
        super(name, barCode); // uvijek ide prije ostalih atributa
        this.horsePower = horsePower;
        this.torque = torque;
        this.type = type;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getTorque() {
        return torque;
    }

    public void setTorque(int torque) {
        this.torque = torque;
    }

    public EngineType getType() {
        return type;
    }

    public void setType(EngineType type) {
        this.type = type;
    }

    @Override
    public void sayWhoIam() {
        System.out.println("I am Engine!");
    }

    public void convertToKWH() {
        System.out.println(this.horsePower * 0.7457);
    }

    @Override
    public String toString() {
        return this.horsePower + " " + this.torque;
    }


}


