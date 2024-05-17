package it.epicode.esercizio2.entitiesOrder;

import it.epicode.esercizio2.entitiesMenu.Item;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderNum;
    private Table table;
    private int covers;
    private List<Item> orderedItems = new ArrayList<>();
    private LocalDate orderTime;
    private OrderStatus orderStatus;
    private double coverChange;
    private double total;

    public Order(int orderNum, Table table, int covers, List<Item> orderedItems, LocalDate orderTime, OrderStatus orderStatus, double coverChange, double total) {
        this.orderNum = orderNum;
        this.table = table;
        this.covers = covers;
        this.orderedItems = orderedItems;
        this.orderTime = LocalDate.now();
        this.orderStatus = OrderStatus.IN_PROGRESS;
        this.coverChange = coverChange;
        this.total = total;
    }

    public double getTotal() {
        return this.orderedItems.stream().mapToDouble(Item::getPrice).sum() + (this.coverChange*this.covers);
    }

    public void addItem(Item item) {
        this.orderedItems.add(item);
    }
}
