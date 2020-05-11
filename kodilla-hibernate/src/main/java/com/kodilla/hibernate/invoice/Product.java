package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;
    private Item item;

    public Product(String name) {
        this.name = name;
    }

    public Product() {
    }

    @Id
    @NotNull
    @GeneratedValue
    public int getId() {
        return id;
    }

    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @ManyToOne()
    @JoinColumn(name = "ITEMS_ID")
    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
