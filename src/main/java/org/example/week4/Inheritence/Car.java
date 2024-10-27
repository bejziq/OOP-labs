package org.example.week4.Inheritence;

public class Car extends Vehicle{
    private CarBrand brand;

    @Override
    public void produceNoise() {
        System.out.println("I am producing Car noise");
    }

    public Car(double speed, int numberOfWheels, CarBrand brand) {
        super(speed, numberOfWheels);
        this.brand = brand;
    }

    public CarBrand getBrand() {
        return this.brand;
    }

    public void setBrand(CarBrand brand) {
        this.brand = brand;
    }

}
