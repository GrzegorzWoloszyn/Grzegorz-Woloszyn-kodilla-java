package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductOrderService implements OrderService {
    @Override
    public boolean order(User user, Product product, LocalDateTime orderDate) {
        System.out.println("Order made for: " + user.getName() + " " + user.getSurname()  + ". Order date: " + orderDate + ". Orders: " + product.productName +
                ", quantity: " + product.productPrice + ", for price: " + product.getOrderValue());

        return true;
    }
}
