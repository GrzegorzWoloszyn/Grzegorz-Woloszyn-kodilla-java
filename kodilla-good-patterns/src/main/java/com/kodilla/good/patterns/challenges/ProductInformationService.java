package com.kodilla.good.patterns.challenges;

import java.time.LocalDateTime;

public class ProductInformationService implements InformationService {
    @Override
    public void inform(User user, Product product, LocalDateTime date) {
        System.out.println("Order made for: " + user.getName() + " " + user.getSurname()  + ". Order date: " + date + ". Orders: " + product.productName +
                ", quantity: " + product.productPrice + ", for price: " + product.getOrderValue());

    }

}
