package com.abhinavgpt.springmidterm.modals;

import java.util.List;
import java.util.Optional;

public class Cart {
    private long id;
    private long userId;
    private String date;

    private List<Product> products;

    public Cart(long id, long userId, String date, List<Product> products) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

}
