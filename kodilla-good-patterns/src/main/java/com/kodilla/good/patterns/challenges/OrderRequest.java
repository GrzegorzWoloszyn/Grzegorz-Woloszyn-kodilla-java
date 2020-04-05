package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequest {

    public User user;
    public Product product;
    public LocalDateTime date;

    public OrderRequest( User user, Product product, LocalDateTime date) {
        this.user = user;
        this.product = product;
        this.date = date;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }

    public LocalDateTime getDate() {
        return date;
    }
}
