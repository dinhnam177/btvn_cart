package com.example.btvn_cart.domain;


import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "cart_details",
    joinColumns = {@JoinColumn(name = "id_cart",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "id_product", referencedColumnName = "id")})
    private List<Product> products = new ArrayList<>();

    public Cart() {
    }
    public Cart(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cart(int id, String name, List<Product> products) {
        this.id = id;
        this.name = name;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", products size=" + products.size() +
                '}';
    }
}
