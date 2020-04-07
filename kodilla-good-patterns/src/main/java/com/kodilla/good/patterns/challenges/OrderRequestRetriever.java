package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class OrderRequestRetriever {

    public OrderRequest retrieve() {
        User user = new User("John", "Travolta");
        Product product = new Product("Beer", 4, 10);
        LocalDateTime date = LocalDateTime.now();

        return new OrderRequest(user, product, date);
    }


}
