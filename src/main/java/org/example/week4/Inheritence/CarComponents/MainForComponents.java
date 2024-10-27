package org.example.week4.Inheritence.CarComponents;

public class MainForComponents {
    public static void main(String[] args) {
        Engine motor = new Engine("Neko ime", "DS2NA", 200, 150, EngineType.COMBUSTION_ENGINE);
        motor.convertToKWH(); // kilovati
        motor.sayWhoIam();
        System.out.println(motor.getHorsePower());
        System.out.println(motor.getType());
        System.out.println(motor.toString());


        Gearbox mjenjac = new Gearbox("neko ime", "KWFF", 7, GearboxType.AUTOMATIC);
        System.out.println(mjenjac.getNumberOfSpeeds());
        System.out.println(mjenjac.getType());
        System.out.println(mjenjac.toString());


    }
}
