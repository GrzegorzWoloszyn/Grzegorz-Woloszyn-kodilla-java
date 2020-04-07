package com.kodilla.good.patterns.challenges;

public class RentalDTO2 {

    public User user;
    public Product product;
    public boolean isOrdered;

    public RentalDTO2(User user, Product product, boolean isOrdered) {
        this.user = user;
        this.product = product;
        this.isOrdered = isOrdered;
    }

    public User getUser() {
        return user;
    }

    public Product getProduct() {
        return product;
    }


}
