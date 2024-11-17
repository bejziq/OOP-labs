package org.example.MidtermPrep.CarManagementSystem;

public class Motorcycle extends Vehicle{
    private double engineCapacity; // engine capacity in cubic centimetes

    public Motorcycle(String vehicleId, String name, double rentalRate, double engineCapacity) {
        super(vehicleId, name, rentalRate);
        this.engineCapacity = engineCapacity;
    }

    @Override
    public String getDescription() {
        return "Engine capacity: " + this.engineCapacity;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
