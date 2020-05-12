package com.kodilla.hibernate.invoice;

import com.sun.istack.NotNull;
import org.graalvm.compiler.nodes.java.ArrayLengthNode;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "PRODUCTS")
public class Product {
    private int id;
    private String name;
    private List<Item> itemList = new ArrayList<>();

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

    public String getName() {
        return name;
    }

    @OneToMany(
            targetEntity = Item.class,
            mappedBy = "product",
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY    )
    public List<Item> getItemList() {
        return itemList;
    }

    public void setItem(List<Item> items) {
        this.itemList= items;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
}
