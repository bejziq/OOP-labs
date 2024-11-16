package org.example.MidtermPrep.MarketplaceInventoryAndOrderManagementSystem;

public class Milk extends Item{
    private double fat; // Represents the fat content in the milk product.

    public Milk(String barcode, String name, double price, double fat) {
        super(barcode, name, price);
        this.fat = fat;
    }

    @Override
    public String getDescription() {
        return "Fat content of a Milk Product is: " + this.fat;
    }

    public double getFat() {
        return fat;
    }

    public void setFat(double fat) {
        this.fat = fat;
    }
}
