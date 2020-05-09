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
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    @NotNull
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.EAGER
    )
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
