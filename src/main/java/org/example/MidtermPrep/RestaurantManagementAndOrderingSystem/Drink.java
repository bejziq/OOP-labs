package org.example.MidtermPrep.RestaurantManagementAndOrderingSystem;

public class Drink extends MenuItem{
    private double volume; // Volume in milliliters (ml)

    public Drink(String code, String name, double price, double volume) {
        super(code, name, price);
        this.volume = volume;
    }

    @Override
    public String getDescription() {
        return "Volume: " + this.volume;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }
}
