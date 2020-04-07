package com.kodilla.good.patterns.challenges;

public class Product {

    public String productName;
    public int productPrice;
    public int productQuantity;
    public double orderValue;


    public Product(String productName, int productPrice, int productQuantity) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
    }

    public String getProductName() {
        return productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public double getOrderValue() {
        return productPrice * productQuantity;
    }
}
