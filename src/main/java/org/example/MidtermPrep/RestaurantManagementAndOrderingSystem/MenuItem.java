package org.example.MidtermPrep.RestaurantManagementAndOrderingSystem;

abstract class MenuItem implements Billable{
    private String code; // Unique identier for each item.
    private String name; // Name of the menu item.
    private double price; // Price of the item.

    public MenuItem(String code, String name, double price) {
        this.code = code;
        this.name = name;
        this.price = price;
    }

    @Override
    public double applyDiscount(double discountRate) {
       return this.price * (discountRate / 100);
    }

    @Override
    public String getDescription() {
        return "Code: " + this.code + "\n" +
                "Name: " + this.name + "\n" +
                "Price: " + this.price;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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
