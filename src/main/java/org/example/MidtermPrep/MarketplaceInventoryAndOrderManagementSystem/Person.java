package org.example.MidtermPrep.MarketplaceInventoryAndOrderManagementSystem;

import java.util.List;
import java.util.ArrayList;


public class Person {
    private String name;
    private int age;
    private List<Order<? extends Item>> orders; // A list of orders associated with the customer. This list can contain orders of various item types.

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.orders = new ArrayList<>();
    }


    public void addOrder(Order<? extends Item> order) {
        orders.add(order);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Order<? extends Item>> getOrders() {
        return orders;
    }

    public void setOrders(List<Order<? extends Item>> orders) {
        this.orders = orders;
    }
}
