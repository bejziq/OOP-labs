package org.example.MidtermPrep.CarManagementSystem;

import java.util.Date;
import java.util.HashMap;

public class Vehicle implements Rentable{
    private String vehicleId;
    private String name;
    private double rentalRate; // Daily rental rate (daily price) of the vehicle.
    private HashMap<Date, Integer> kilometersRecord; // A map where the key is the rental date, and the value is the number of kilometers driven on that date.


    public Vehicle(String vehicleId, String name, double rentalRate) {
        this.vehicleId = vehicleId;
        this.name = name;
        this.rentalRate = rentalRate;
    }

    @Override
    public double applyDiscount(double discountRate) {
        return this.rentalRate * (discountRate / 100);
    }


    @Override
    public String getDescription() {
        return "Vehicle id: " + this.vehicleId + "\n" +
                "Vehicle name: " + this.name + "\n"  +
                "Rental rate of Vehicle: " + this.rentalRate;
    }

    public void addKilometers(Date rentalDate, int kilometers) {
        kilometersRecord.put(rentalDate, kilometers);
    }

    public int getTotalKilometers() {
        int total = 0;
        for (int kilometer : kilometersRecord.values()) {
            total += kilometer;
        }
        return total;
    }

    public String getVehicleId() {
        return vehicleId;
    }

    public void setVehicleId(String vehicleId) {
        this.vehicleId = vehicleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(double rentalRate) {
        this.rentalRate = rentalRate;
    }
}

