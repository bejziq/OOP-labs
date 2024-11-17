package org.example.MidtermPrep.CarManagementSystem;

public class Car extends Vehicle{
    private CarType carType; // type of a car
    private String engineType; // e.g diesel, electric...

    public Car(String vehicleId, String name, int rentalRate, CarType carType, String engineType) {
        super(vehicleId, name, rentalRate);
        this.carType = carType;
        this.engineType = engineType;
    }

    @Override
    public String getDescription() {
        return "Type of a car: " + this.carType + "\n"
                + "Engine type: " + this.engineType;
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}
