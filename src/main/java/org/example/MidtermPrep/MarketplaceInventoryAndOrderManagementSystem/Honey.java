package org.example.MidtermPrep.MarketplaceInventoryAndOrderManagementSystem;

public class Honey extends Item{
    private HoneyType honeyType; // enum

    public Honey(String barcode, String name, double price, HoneyType honeyType) {
        super(barcode, name, price);
        this.honeyType = honeyType;
    }

    @Override
    public String getDescription() {
        return "The Type of a Honey is: " + this.honeyType;
    }

    public HoneyType getHoneyType() {
        return honeyType;
    }

    public void setHoneyType(HoneyType honeyType) {
        this.honeyType = honeyType;
    }
}
