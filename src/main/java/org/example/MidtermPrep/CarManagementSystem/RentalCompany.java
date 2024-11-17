package org.example.MidtermPrep.CarManagementSystem;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class RentalCompany {
    private String companyName;
    private List<Customer> customers = new ArrayList<>(); // List of customers who have rented vehicles
    private Map<String, Vehicle> vehicleInventory = new HashMap<>(); //  A map of vehicles (both Car and Motorcycle) available for rent.

    public RentalCompany(String companyName) {
        this.companyName = companyName;
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public void addVehicle(Vehicle vehicle) {
        vehicleInventory.put(vehicle.getVehicleId(), vehicle); // on particular vehicle id put the new vehicle
    }

    public Customer getCustomer(String customerId) {
        for (Customer customer : customers) {
            if (customer.getCustomerId().equals(customerId)) {
                return customer;
            }
        }
        return null;
    }

    public void displayInventory() {
        for (Vehicle vehicle : vehicleInventory.values()) {
            System.out.println(vehicle.getDescription());
        }
    }

    public double calculateTotalRevenue() {
        double total = 0.0;

        for (Customer customer : customers) {
            for (RentalTransaction<? extends Vehicle> transaction : customer.getRentalHistory()) {
                total += transaction.calculateTotalAmount();
            }
        }
        return total;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

    public Map<String, Vehicle> getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(Map<String, Vehicle> vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }
}
