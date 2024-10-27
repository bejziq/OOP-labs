package org.example.week4.Inheritence;

public class Start {
    public static void main(String[] args) {
        Car hisCar = new Car(300, 4, CarBrand.PORSCHE);
        System.out.println(hisCar.getBrand());
        System.out.println(hisCar.getSpeed());

        Bycicle biciklo = new Bycicle(30, 2, BicycleType.MTB);
        System.out.println(biciklo.getType());
        System.out.println(biciklo.getNumberOfWheels());

        changeObject(biciklo);

        System.out.println(biciklo.getType()); // bilo mtb, poslije poziva funkcijke je bmx

        biciklo.produceNoise();
        hisCar.produceNoise();

        Vehicle nekoVozilo = new Vehicle(202, 2);
        nekoVozilo.produceNoise();

    }

    public static void changeObject(Bycicle biciklo) {
        biciklo.setType(BicycleType.BMX);
    }
}
