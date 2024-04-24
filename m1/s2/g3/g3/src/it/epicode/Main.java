package it.epicode;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {

    static List<Customer> customers = new ArrayList<>();
    static List<Order> orders = new ArrayList<>();
    static List<Product> products = new ArrayList<>();

    public static void main (String[] args) {

    }

    public static List<Product> getBooks() {
        return products.stream().filter(product -> product.getCategory().equals("Books") && product.getPrice()>100).toList();
    }

    public static List<Order> getBabyOrders() {
        return orders.stream().filter(order -> order.getProducts().stream().anyMatch(product -> product.getCategory().equals("Baby"))).toList();
    }

    public static List<Product> getDiscountBoys() {
        return products.stream().filter(product -> product.getCategory().equals("Boys")).map(product -> {
            product.setPrice(product.getPrice()*0.9);
            return product;
        }).toList();
    }

    public static List<Product> getTier2Products() {
        List<Order> ordersByTierAndDate = orders.stream().filter(order -> order.getCustomer().getTier()==2
            && order.getOrderDate().isAfter(LocalDate.parse("2024-02-01"))
            && order.getOrderDate().isBefore(LocalDate.parse("2024-04-01")))
        .toList();

        // return ordersByTierAndDate.stream().filter(order -> order.getProducts().stream()).toList();
    }

}
