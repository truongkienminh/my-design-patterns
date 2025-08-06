package com.kienminh.ConcreteObserver;

import com.kienminh.Observer.Customer;

public class RegularCustomer implements Customer {
    private String name;

    public RegularCustomer(String name) {
        this.name = name;
    }

    @Override
    public void update(String productName, double newPrice) {
        System.out.println("📩 " + name + " nhận được thông báo: " + productName + " giảm giá còn " + newPrice + " VND!");
    }
}
