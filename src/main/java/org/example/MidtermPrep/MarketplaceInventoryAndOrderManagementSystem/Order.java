package org.example.MidtermPrep.MarketplaceInventoryAndOrderManagementSystem;

import java.util.*;

public class Order <T extends Item  & Sellable>  {
    private String orderNo;
    private Date createdAt; // The creation date of the order.
    private HashMap<T,Integer> items; //  A map of items and their quantities in the order.

    public Order(String orderNo, Date createdAt) {
        this.orderNo = orderNo;
        this.createdAt = createdAt;
        this.items = new HashMap<>(); // initialize items attribute as new hashmap, items are ready to use and they are not null, items map is always initialize
    }

    public void addItem(T item, int quantity) { // item is of type T which extends item and implements sellable
        if (items.containsKey(item)) {
            items.put(item, items.get(item) + quantity); // put item, updated quantity
        }
        else {
            items.put(item, quantity);
        }
    }

    public double calculateTotalAmount() {
        double total = 0.0;

        for (T item : items.keySet()) {
            int quantity = items.get(item);
            total += item.getPrice() * quantity;
        }
        return total;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public HashMap<T, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<T, Integer> items) {
        this.items = items;
    }
}
