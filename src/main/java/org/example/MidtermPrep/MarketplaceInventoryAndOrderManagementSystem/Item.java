package org.example.MidtermPrep.MarketplaceInventoryAndOrderManagementSystem;

abstract class Item implements Sellable{
    private String barcode;
    private String name;
    private double price;


    public Item(String barcode,String name, double price) {
        this.barcode = barcode;
        this.name = name;
        this.price = price;
    }

    @Override
    public double calculateDiscount(double discountRate) {
        return this.price - (discountRate/100);
    }

    @Override
    public String getDescription() {
        return "Bar Code of Product: " + this.barcode + "\n" +
                " Name of The Product: " + this.name + "\n" +
                "Price of The Product: " + this.price;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}