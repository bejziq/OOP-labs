package org.example.MidtermPrep.RestaurantManagementAndOrderingSystem;

import java.util.Date;
import java.util.HashMap;

public class TableReservation <T extends MenuItem & Billable>{
    private String reservationId;
    private Date reservationDate;
    private HashMap<T, Integer> orderedItems; // : A map of items and their quantities ordered during the reservation.
    private int tableNumber;

    public TableReservation(String reservationId, Date reservationDate, int tableNumber) {
        this.reservationId = reservationId;
        this.reservationDate = reservationDate;
        this.orderedItems = new HashMap<>();
    }

    public void addItemToOrder(T item, int quantity) {
        if (orderedItems.containsKey(item)) {
            orderedItems.put(item, orderedItems.get(item) + quantity);
        }
        else {
            orderedItems.put(item, quantity);
        }
    }

    public double calculateTotalAmount() {
        double total = 0.0;

        for (T item : orderedItems.keySet()) {
            int quantity = orderedItems.get(item);
            total += quantity * item.getPrice();
        }

        return total;
    }

    public String getReservationId() {
        return reservationId;
    }

    public void setReservationId(String reservationId) {
        this.reservationId = reservationId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }

    public HashMap<T, Integer> getOrderedItems() {
        return orderedItems;
    }

    public void setOrderedItems(HashMap<T, Integer> orderedItems) {
        this.orderedItems = orderedItems;
    }

    public int getTableNumber() {
        return tableNumber;
    }

    public void setTableNumber(int tableNumber) {
        this.tableNumber = tableNumber;
    }
}
