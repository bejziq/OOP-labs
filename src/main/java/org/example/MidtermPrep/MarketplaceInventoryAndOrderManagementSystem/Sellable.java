package org.example.MidtermPrep.MarketplaceInventoryAndOrderManagementSystem;

public interface Sellable {
    double calculateDiscount(double discountRate);
    String getDescription();

}
