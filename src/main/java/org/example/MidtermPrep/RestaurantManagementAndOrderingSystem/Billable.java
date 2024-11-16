package org.example.MidtermPrep.RestaurantManagementAndOrderingSystem;

public interface Billable {
    double applyDiscount(double discountRate);
    String getDescription();
}
